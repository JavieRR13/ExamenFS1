package javiermartin.fullstack.galeria.validator;

	import java.lang.annotation.ElementType;
	import java.lang.annotation.Retention;
	import java.lang.annotation.RetentionPolicy;
	import java.lang.annotation.Target;

	import jakarta.validation.Constraint;
	import jakarta.validation.Payload;

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.FIELD)
	@Constraint(validatedBy = CuadroDescValid.class)

	public @interface CuadroDescValidator {

		String message() default "descripción no válida." + "Debe tener más de cinco palabras.";

		Class<?>[] groups() default {};

		Class<? extends Payload>[] payload() default {};
}
