package com.synesis.bcc.structure.helpers.validators.annotations;

import com.synesis.bcc.structure.helpers.validators.implementations.UserSummaryValidityChecker;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = UserSummaryValidityChecker.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidUserSummary {
    String message() default "{com.synesis.bcc.structure.message.ValidUserType}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
