package com.company;

import java.util.Scanner;

public class USER {
    private String name;
    private  int age;
    private int maxLenth = 20;



    public String getName() {
        return name; }

    public void setName(String name) throws IllegalNameLengthException {
        if (name.length() > maxLenth) {
            throw new IllegalNameLengthException("Вы превысили длину допустимых символов");

        }
            this.name = name;

         }

    public int getAge() {
        return age; }

    public void setAge(int age) {
        if (age<1 || age > 101){
            throw new ageException("Недопустимое число");
        }
        this.age = age;
         }


}
