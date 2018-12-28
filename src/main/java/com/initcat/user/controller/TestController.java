package com.initcat.user.controller;

import com.initcat.user.model.req.LoginReq;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

    @PostMapping(value = "/test", consumes = "application/json")
    public void test(@Valid @RequestBody LoginReq request, @RequestParam(value = "test", required = false) String test) {
        // @RequestParam required 非空为false时不穿该参数也会进入该方法
        System.out.println(test);
    }
}
