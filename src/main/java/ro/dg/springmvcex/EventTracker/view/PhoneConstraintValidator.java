package ro.dg.springmvcex.EventTracker.view;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class PhoneConstraintValidator implements ConstraintValidator<Phone, String> {

    @Override
    public void initialize(Phone phone) {
    }

    @Override
    public boolean isValid(String phoneField, ConstraintValidatorContext context) {
        if(phoneField==null) {
            return false;
        }

        return phoneField.matches("[0-9()-]*");
    }
}
