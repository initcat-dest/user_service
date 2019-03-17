package com.initcat.user.service.impl;

import com.alicp.jetcache.anno.Cached;
import com.initcat.user.model.db.CommUser;
import com.initcat.user.repository.CommUserRepository;
import com.initcat.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.initcat.user.constant.redis.UserRedisConstant.USER_INFO;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    CommUserRepository commUserRepository;

    @Override
    @Cached(name = USER_INFO, key = "#userNumber", expire = 200)
    public CommUser login(String userNumber, String passWard, Integer userType) {
        return commUserRepository.findByNumber(userNumber);
    }

}
