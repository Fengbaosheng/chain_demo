package learn.insight.chain.validation;

import learn.insight.chain.exception.ValidatorException;

public class MinValidatorHandler implements ValidatorHandler {
    private final int min;

    public MinValidatorHandler(int min) {
        this.min = min;
    }

    @Override
    public void validate(Object value) throws ValidatorException {
        if (value instanceof Integer) {
            int intValue = (Integer) value;
            if (intValue < min) {
                throw new ValidatorException("你的值是" + intValue + ",不能小于" + min);
            }
        }
    }
}
