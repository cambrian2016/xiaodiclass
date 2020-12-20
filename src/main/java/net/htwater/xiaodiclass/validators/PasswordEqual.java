package net.htwater.xiaodiclass.validators;

import org.hibernate.validator.constraints.Length;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Constraint(validatedBy = PasswordValidator.class)
public @interface PasswordEqual {
    int min() default 4;

    int max() default 10;

    String message() default "passwords are not equal or length not match";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


}
