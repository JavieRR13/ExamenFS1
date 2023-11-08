package javiermartin.fullstack.galeria.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CuadroDescValid implements ConstraintValidator<CuadroDescValidator, String>{

	@Override
    public void initialize(CuadroDescValidator constraintAnnotation) {
    }

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null || value.trim().isEmpty()) {
			return false;
		}
            String[] palabras = value.trim().split("\s+");
            return palabras.length >= 5;
	}

}
