package com.synesis.bcc.structure.helpers.validators.implementations;

import com.synesis.bcc.structure.database.repositories.UserStateRepository;
import com.synesis.bcc.structure.helpers.validators.annotations.ValidUserState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class UserStateValidityChecker implements ConstraintValidator<ValidUserState, Integer> {

    private final UserStateRepository repository;

    public UserStateValidityChecker(@Autowired UserStateRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return repository.findById(value).isPresent();
    }
}
