package com.initcat.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class description
 *
 * @author libo
 * @package com.initcat.controller
 * @company xmiles
 * @date 2018/11/27
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String helloSpringBoot() {
        return "Hello SpringBoot Project.";
    }

}
