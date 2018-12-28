package com.initcat;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * spring application
 *
 * @author libo
 * @package com.initcat
 * @company xmiles
 * @date 2018/12/10
 */
@SpringBootApplication(scanBasePackages = {"com.alicp.jetcache.autoconfigure"})
@ComponentScan(basePackages = "com.initcat")
@EnableMethodCache(basePackages = "com.initcat")
@EnableCreateCacheAnnotation
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
