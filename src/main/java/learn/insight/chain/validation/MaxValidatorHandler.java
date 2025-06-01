package learn.insight.chain.validation;

import learn.insight.chain.exception.ValidatorException;

public class MaxValidatorHandler implements ValidatorHandler {
    private final int max;

    public MaxValidatorHandler(int max) {
        this.max = max;
    }

    @Override
    public void validate(Object value) throws ValidatorException {
        if (value instanceof Integer) {
            int intValue = (Integer) value;
            if (intValue > max) {
                throw new ValidatorException("你的值是" + intValue + ",不能大于" + max);
            }
        }
    }
}
