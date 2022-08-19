package com.scanner;

import java.util.Scanner;

public class PersonCreator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String name = scanner.next();
        System.out.print("Enter the age : ");
        int age = scanner.nextInt();
        System.out.print("Enter the phone number : ");
        long phoneNumber = scanner.nextLong();
        Person person = new Person(name, age, phoneNumber);
    }
}
