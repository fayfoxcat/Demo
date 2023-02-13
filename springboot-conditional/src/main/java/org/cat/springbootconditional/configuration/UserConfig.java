package org.cat.springbootconditional.configuration;

import org.cat.springbootconditional.annotation.ConditionCustomizeClass;
import org.cat.springbootconditional.condition.UserCondition;
import org.cat.springbootconditional.domain.entity.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    @Conditional(UserCondition.class)
    public User user() {
        return new User();
    }

    @Bean
    @ConditionCustomizeClass({"lombok.Data"})
    public User user2() {
        return new User();
    }

    @Bean
    @ConditionalOnProperty(name = "user.age", havingValue =" 17")
    public User user3() {
        return new User();
    }
}
