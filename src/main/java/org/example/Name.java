package org.example;

public class Name {
    private String name;

    private int age;

    public Name(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "名前は" + this.getName() + "で、年齢は" + this.getAge() + "です。";
    }
}
