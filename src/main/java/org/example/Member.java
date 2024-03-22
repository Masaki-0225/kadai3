package org.example;

public class Member {
    private String name;
    private String ult;

    public Member(String name, String ult) {
        this.name = name;
        this.ult = ult;
    }


    public String getName() {
        return name;
    }

    public String getUlt() {
        return ult;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUlt(String ult) {
        this.ult = ult;
    }
}
