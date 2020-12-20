package net.htwater.xiaodiclass.validators;

import net.htwater.xiaodiclass.model.entity.Person;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<PasswordEqual, Person> {
    private int min;
    private int max;

    @Override
    public void initialize(PasswordEqual constraintAnnotation) {
        min= constraintAnnotation.min();
        max= constraintAnnotation.max();
    }

    @Override
    public boolean isValid(Person person, ConstraintValidatorContext constraintValidatorContext) {
        String password1=person.getPassword1();
        String password2=person.getPassword2();
        return password1.equals(password2) && password1.length()>=min && password2.length()<=max;
    }
}
