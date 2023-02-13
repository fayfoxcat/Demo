package org.cat.springbootconditional.annotation;

import org.cat.springbootconditional.condition.UserCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author cat
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(UserCondition.class)
public @interface ConditionCustomizeClass {

    String[] value();
}
