package validation.constraint;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.ReportAsSingleViolation;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import validation.gorup.CreditCardGroup;
import validation.gorup.VirtualAccountGroup;
import validation.constraint.CheckCaseValidator;
import validation.enums.CaseMode;
import jakarta.validation.Payload;

@CheckCase(groups = { CreditCardGroup.class,
    VirtualAccountGroup.class }, mode = CaseMode.UPPER, message = "{order.id.upper}")
@NotBlank(groups = { CreditCardGroup.class, VirtualAccountGroup.class }, message = "{order.id.notblank}")
@Size(groups = { CreditCardGroup.class, VirtualAccountGroup.class }, min = 1, max = 10, message = "{order.id.size}")
@Documented
@Constraint(validatedBy = {})
@Target({ FIELD })
@Retention(RUNTIME)
@ReportAsSingleViolation
public @interface CheckOrderId {

  String message() default "invalid order id";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};

}