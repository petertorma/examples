package xyz.codingmentor.beanvalidation.constraint;

import xyz.codingmentor.beanvalidation.Customer;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author Dénes László <denes.laszlo@clarmont.hu>
 */
public class FirstFillLastFillValidator implements ConstraintValidator<FirstFillLastFill, Customer> {

    @Override
    public void initialize(FirstFillLastFill constraintAnnotation) {
    }

    @Override
    public boolean isValid(Customer value, ConstraintValidatorContext context) {
        if (value.getFirstName() != null) {
            return value.getLastName() != null;
        }
        return true;
    }


}
