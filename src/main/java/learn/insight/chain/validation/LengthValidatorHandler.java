package learn.insight.chain.validation;

import learn.insight.chain.exception.ValidatorException;

public class LengthValidatorHandler implements ValidatorHandler {
    private final int length;

    public LengthValidatorHandler(int length) {
        this.length = length;
    }

    @Override
    public void validate(Object value) throws ValidatorException {
        if (value instanceof String) {
            int stringValue = ((String) value).length();
            if (stringValue != length) {
                throw new ValidatorException("你的字符串长度是" + stringValue + ",应该是" + length);
            }
        }
    }
}
