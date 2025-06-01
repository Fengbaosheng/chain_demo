package learn.insight.chain;

import learn.insight.chain.annotation.Length;
import learn.insight.chain.annotation.Max;
import learn.insight.chain.annotation.Min;

public class User {
    @Length(4)
    private String name;

    @Max(100)
    @Min(1)
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
