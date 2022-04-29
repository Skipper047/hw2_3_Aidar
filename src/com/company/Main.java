package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    USER user = new USER();
    Scanner scanner = new Scanner(System.in);
    Boolean isAgeException=false;
    while (true){
        try{
            if (!isAgeException){
                System.out.println("Введите имя: ");
                String name = scanner.next();
                user.setName(name);
                System.out.println("Ваше имя: "+ user.getName());
            }
            System.out.println("Введите возраст: ");
            int age = scanner.nextInt();
            user.setAge(age);
            isAgeException = false;

        }catch (IllegalNameLengthException e){
            System.out.println(e.getMessage());
        }
        catch (ageException a){
            System.out.println(a.getMessage());
            isAgeException=true;
        }
    }

    }
}
