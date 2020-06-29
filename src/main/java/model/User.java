package model;

import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {

    @NotEmpty(message = "khong de trong truong nay")
    @Size(min = 2, max = 20)
    private String name;

    @Min(value = 18, message = "khong du 18 tuoi")
    private int age;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
