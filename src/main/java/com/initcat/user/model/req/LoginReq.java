package com.initcat.user.model.req;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * 登录请求对象
 * @author libo
 * @package com.initcat.dto.req
 * @company initcat
 * @date 2018/11/26
 */
@Data
public class LoginReq {

    @NotEmpty(message = "登录手机号不能为空")
    private String phone;

    @NotEmpty(message = "登录密码不能为空")
    private String passward;

}
