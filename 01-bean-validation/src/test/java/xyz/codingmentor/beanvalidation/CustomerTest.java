package xyz.codingmentor.beanvalidation;

import xyz.codingmentor.beanvalidation.Customer;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author developer
 */
public class CustomerTest {

    private static ValidatorFactory vf;
    private static Validator validator;

    @BeforeClass
    public static void init() {
        vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
    }

    @AfterClass
    public static void close() {
        vf.close();
    }

    @Test
    public void shouldRaiseNoConstraintViolation() {

        Customer customer = new Customer("Kiss", "Béla", "belakiss@gmail.com");
        Set<ConstraintViolation<Customer>> violations = validator.validate(customer);
        Assert.assertEquals(0, violations.size());
    }

    @Test
    public void shouldRaiseConstraintViolationCauseInvalidEmail() {

        Customer customer = new Customer("Szenes", "László", "dummyEmail");
        Set<ConstraintViolation<Customer>> violations = validator.validate(customer);
        Assert.assertEquals(1, violations.size());
        Assert.assertEquals("invalid email address", violations.iterator().next().getMessage());
        Assert.assertEquals("dummyEmail", violations.iterator().next().getInvalidValue());
        Assert.assertEquals("{Email.message}", violations.iterator().next().getMessageTemplate());
    }
}
