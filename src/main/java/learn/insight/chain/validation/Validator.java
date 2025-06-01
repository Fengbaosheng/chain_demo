package learn.insight.chain.validation;

import learn.insight.chain.annotation.Length;
import learn.insight.chain.annotation.Max;
import learn.insight.chain.annotation.Min;

import java.lang.reflect.Field;

public class Validator {

    public void validate(Object bean) throws Exception {
        Class<?> beanClass = bean.getClass();
        for (Field field : beanClass.getDeclaredFields()) {
            field.setAccessible(true);
            ValidatorChain chain = buildValidatorChain(field);
            chain.validate(field.get(bean));
        }

    }

    private ValidatorChain buildValidatorChain(Field field) {
        ValidatorChain validatorChain = new ValidatorChain();
        Max max = field.getAnnotation(Max.class);
        if (null != max) {
            validatorChain.addLastHandler(new MaxValidatorHandler(max.value()));
        }

        Min min = field.getAnnotation(Min.class);
        if (null != min) {
            validatorChain.addLastHandler(new MinValidatorHandler(min.value()));
        }

        Length length = field.getAnnotation(Length.class);
        if (null != length) {
            validatorChain.addLastHandler(new LengthValidatorHandler(length.value()));
        }
        return validatorChain;
    }
}
