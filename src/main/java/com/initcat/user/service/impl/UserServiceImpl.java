package com.initcat.user.service.impl;

import com.alicp.jetcache.anno.Cached;
import com.initcat.user.model.db.CommUser;
import com.initcat.user.repository.CommUserRepository;
import com.initcat.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import static com.initcat.user.constant.redis.UserRedisConstant.USER_INFO;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    CommUserRepository commUserRepository;

    @Override
    @Cached(name = USER_INFO, key = "#userPhone", expire = 200)
    public CommUser login(String userPhone, String passWard) {
        return commUserRepository.findByPhone(userPhone);
    }

    @Override
    public int save(CommUser entity) {
        if (entity==null)
            throw  new IllegalArgumentException("新建用户不能为空");
        if (StringUtils.isEmpty(entity.getPhone()))
            throw new IllegalArgumentException("手机号不能为空");
        if (StringUtils.isEmpty(entity.getPassword()))
            throw new IllegalArgumentException("密码不能为空");
        if(entity.getPassword().length()<6)
            throw new IllegalArgumentException("密码不能少于6位数");
        commUserRepository.saveAndFlush(entity);

        return 1;
    }

    @Override
    public int update(CommUser entity) {
        if (StringUtils.isEmpty(entity.getName()))
            throw new IllegalArgumentException("姓名不能为空");
        if (StringUtils.isEmpty(entity.getSex()))
            throw new IllegalArgumentException("性别不能为空");
        if (StringUtils.isEmpty(entity.getAge()))
            throw new IllegalArgumentException("年龄不能为空");
        commUserRepository.update(entity);
        return 1;
    }

}
