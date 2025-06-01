package learn.insight.chain.validation;

import learn.insight.chain.exception.ValidatorException;

import java.util.ArrayList;
import java.util.List;

public class ValidatorChain {

    private final List<ValidatorHandler> handlers = new ArrayList<>();

    public void validate(Object value) throws ValidatorException {
        for (ValidatorHandler handler : handlers) {
            handler.validate(value);
        }
    }

    public void addLastHandler(ValidatorHandler handler) {
        this.handlers.add(handler);
    }
}
