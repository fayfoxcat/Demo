package org.cat.springbootenableother.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class EnableImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{
                "org.cat.springbootenableother.domain.entity.Role",
                "org.cat.springbootenableother.domain.entity.User"
        };
    }
}
