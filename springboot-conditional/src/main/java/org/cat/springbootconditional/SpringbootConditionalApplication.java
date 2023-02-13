package org.cat.springbootconditional;

import org.cat.springbootconditional.domain.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author cat
 */
@SpringBootApplication
public class SpringbootConditionalApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootConditionalApplication.class, args);

//        User user = context.getBean(User.class);
//        System.out.println(user);

        Object user2 = context.getBean("user2");
        System.out.println(user2);

//        Object user3 = context.getBean("user3");
//        System.out.println(user3);


    }

}
