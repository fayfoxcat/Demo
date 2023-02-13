package org.cat.springbootmybatis;

import org.cat.springbootmybatis.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringbootMybatisApplication.class)
class SpringbootMybatisApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        System.out.println(userService.list());
    }

    @Test
    void userList(){
        System.out.println(userService.list("年"));
    }

}
