package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name= scanner.nextLine();      // nextLine() để nhập tên từ bàn phím

        System.out.println("Hello: " + name);

    }
}
