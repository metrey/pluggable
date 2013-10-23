package com.itrustcambodia.pluggable.validator;

import org.apache.wicket.validation.IValidatable;
import org.apache.wicket.validation.IValidator;
import org.apache.wicket.validation.ValidationError;

public class FloatValidator implements IValidator<String> {

    /**
     * 
     */
    private static final long serialVersionUID = -7838496297560085103L;

    @Override
    public void validate(IValidatable<String> validatable) {
        if (validatable.getValue() != null && !"".equals(validatable.getValue())) {
            try {
                Float.valueOf(validatable.getValue());
            } catch (NumberFormatException e) {
                ValidationError error = new ValidationError(this);
                error.setVariable("input", validatable.getValue());
                validatable.error(error);
            }
        }
    }

}