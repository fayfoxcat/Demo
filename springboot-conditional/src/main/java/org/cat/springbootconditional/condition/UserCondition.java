package org.cat.springbootconditional.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;

public class UserCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        try {
            Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes("org.cat.springbootconditional.annotation.ConditionCustomizeClass");
            String[] values = (String[]) Optional.ofNullable(annotationAttributes).orElse(Collections.emptyMap()).get("value");
            for (String value : values) {
                Class.forName(value);
            }
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
