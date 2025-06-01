package learn.insight.chain.validation;

import learn.insight.chain.exception.ValidatorException;

public interface ValidatorHandler {
    void validate(Object value) throws ValidatorException;
}
