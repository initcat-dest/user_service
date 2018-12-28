package com.initcat.user.test;

import com.initcat.Application;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * class description
 *
 * @author libo
 * @package com.initcat.user.test
 * @company initcat
 * @date 2018/12/26
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class CommonTest {

    @Autowired
    StringEncryptor encryptor;

    @Test
    public void jasyptTest() {

        String url = encryptor.encrypt("jdbc:mysql://XXXX:3306/initcat?useUnicode=true&characterEncoding=UTF-8&useSSL=false");
        String name = encryptor.encrypt("XXXX");
        String password = encryptor.encrypt("XXXX");
        String ip = encryptor.encrypt("XXXX");
        System.out.println(url+"----------------");
        System.out.println(name+"----------------");
        System.out.println(password+"----------------");
        System.out.println(ip+"----------------");
        Assert.assertTrue(name.length() > 0);
        Assert.assertTrue(password.length() > 0);
    }

}
