package com.xiaoyang;

import com.xiaoyang.controller.AuthController;
import com.xiaoyang.service.SysUserService;
import com.xiaoyang.service.impl.SysUserServiceImpl;
import com.xiaoyang.utils.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.io.IOException;

@SpringBootTest
class VueadminJavaApplicationTests {

    @Autowired
    RedisUtil redisUtil;

    @Autowired
    AuthController authController;

    @Autowired
    SysUserServiceImpl sysUserService;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Test
    void testRedis(){

        redisUtil.hset("k1","f1","v1",120);
    }

    @Test
    void testAuthController() throws IOException {

        authController.captcha();
    }

    @Test
    void test2(){
        String s = bCryptPasswordEncoder.encode("1111");
        System.out.println(s);
    }


}
