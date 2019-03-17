package com.initcat.user.provide.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.initcat.user.provide.service.ServiceTest;

/**
 * class description
 *
 * @author libo
 * @package com.initcat.user.provide
 * @company xmiles
 * @date 2019/3/12
 */
@Service
public class ServiceTestImpl implements ServiceTest {

	@Override
	public String loginTest() {
		return "测试登录";
	}
}
