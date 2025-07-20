package com.sb.practice.nowornever.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "check.conditional.property", havingValue = "true" ,matchIfMissing = true)
public class ConditionalProperty {
    public void checkProperty() {
        System.out.println("Conditional property check passed.");
    }
}
