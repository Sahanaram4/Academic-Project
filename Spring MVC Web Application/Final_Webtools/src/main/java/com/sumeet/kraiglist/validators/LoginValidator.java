package com.sumeet.kraiglist.validators;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.sumeet.kraiglist.pojo.User;

@Component
public class LoginValidator implements Validator {

	      public boolean supports(Class aClass)
	      {
	          return aClass.equals(User.class);
	      }

	      public void validate(Object obj, Errors errors)
	      {
	          User user = (User)obj;
	          ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "error.invalid.user", "User Name Required");
	          ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.invalid.password", "Password Required");
	      }
}
