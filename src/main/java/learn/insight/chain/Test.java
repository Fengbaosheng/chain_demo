package learn.insight.chain;

import learn.insight.chain.validation.Validator;

public class Test {
    public static void main(String[] args) throws Exception {
        User user = new User("rose", 20);
        Validator validator = new Validator();
        validator.validate(user);
    }
}
