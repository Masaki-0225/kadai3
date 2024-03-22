package org.example;

public class Hoge {
    private String hoge;

    public Hoge(String hoge) {
        this.hoge = hoge;
    }

    public void ahoge() {
        System.out.println(ho("hirakawa"));
    }

    public String ho(String hoge) {
        return hoge + "さん";
    }
}
