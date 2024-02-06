package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Name> nameList = new ArrayList<>();
        nameList.add(new Name("ジャック", 24));
        nameList.add(new Name("マーカス", 35));
        nameList.add(new Name("平川", 32));
        nameList.add(new Name("ピカチュウ", 63));

        for (int i = 0; i < 5; i++) {
            try {
                if (i < 0 || nameList.size() <= i) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                System.out.println(nameList.get(i));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("この数値は存在しません；" + i);
            }
        }
    }
}
