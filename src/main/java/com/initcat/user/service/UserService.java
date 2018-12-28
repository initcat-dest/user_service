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
     * @param userNumber 用户编号
     * @param passWard 密码
     * @param userType 用户类型
     * @return 用户信息
     */
    CommUser login(String userNumber, String passWard, Integer userType);

}
