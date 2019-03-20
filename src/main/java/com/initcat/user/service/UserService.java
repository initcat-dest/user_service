package com.initcat.user.service;

import com.initcat.user.model.db.CommUser;

/**
 * class description
 *
 * @author libo
 * @package com.initcat.user.service
 * @company xmiles
 * @date 2018/12/10
 */
public interface UserService {

    /**
     * 登录
     * @param userPhone 用户手机号
     * @param passWard 密码
     * @return 用户信息
     */
    CommUser login(String userPhone, String passWard);

    /**
     * 新建
     * @author limingsong
     */
    int save(CommUser entity);
    /**
     * 新建
     * @author limingsong
     */
    int update(CommUser entity);
}
