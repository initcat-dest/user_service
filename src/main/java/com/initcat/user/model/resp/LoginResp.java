package com.initcat.user.model.resp;

import com.initcat.user.model.db.CommUser;
import lombok.Data;

/**
 * 登录返回对象
 * @author libo
 * @package com.initcat.dto.resp
 * @company initcat
 * @date 2018/11/27
 */
@Data
public class LoginResp {

    private CommUser commUser;

}
