package xyz.codingmentor.beanvalidation.constraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *
 * @author Dénes László <denes.laszlo@clarmont.hu>
 */
@Constraint(validatedBy = FirstFillLastFillValidator.class)
@Target({ElementType.TYPE})
@Retention(RUNTIME)
public @interface FirstFillLastFill {

    String message() default "{FirstFillLastFill.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
