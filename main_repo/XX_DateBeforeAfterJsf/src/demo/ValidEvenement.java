package demo;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = { EvenementValidator.class })
@Documented
@Target({ TYPE, METHOD, FIELD })
@Retention(RUNTIME)
public @interface ValidEvenement
{
	String message() default "Evénement invalide à cause des dates";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
