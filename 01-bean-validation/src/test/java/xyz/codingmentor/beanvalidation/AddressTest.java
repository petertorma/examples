package xyz.codingmentor.beanvalidation;

import xyz.codingmentor.beanvalidation.Address;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author developer
 */
public class AddressTest {

    @Test
    public void shouldRaiseConstraintiolentExceptionCauseInvalidZipCode() {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        Validator validatior = vf.getValidator();
        vf.close();
        Address address = new Address("Körvasút sor 81", "Budapest", "dummyZip");

        Set<ConstraintViolation<Address>> violations = validatior.validate(address);
        Assert.assertEquals(1, violations.size());
    }

}
