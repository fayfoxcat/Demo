package org.cat.springbootenable;

import org.cat.springbootenableother.config.EnableImportSelector;
import org.cat.springbootenableother.config.MyImportBeanDefinitionRegister;
import org.cat.springbootenableother.domain.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@ComponentScan("org.cat.springbootenableother.config")
//@Import(UserConfig.class)
//@EnableUser
//@Import(User.class)
//@Import(EnableImportSelector.class)
@Import(MyImportBeanDefinitionRegister.class)
public class SpringbootEnableApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootEnableApplication.class, args);

//        Object user = context.getBean("user");
        User user = context.getBean(User.class);
        System.out.println(user);
    }

}
