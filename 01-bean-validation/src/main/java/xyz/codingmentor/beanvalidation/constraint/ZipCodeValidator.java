package xyz.codingmentor.beanvalidation.constraint;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author developer
 */
public class ZipCodeValidator implements ConstraintValidator<ZipCode, String> {

    private final Pattern zipPattern = Pattern.compile("[0-9]{4,4}");

    @Override
    public void initialize(ZipCode zipCode) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext cvc) {
        if (value == null) {
            return true;
        }
        Matcher m = zipPattern.matcher(value);
        
        return m.matches();
    }
}
