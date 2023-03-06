package domain;

import java.util.Scanner;

public class Combine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter product id");
        int id=sc.nextInt();
        System.out.println("1:modify name\n2:modify price\n3:modify type");
        int choice= sc.nextInt();
    }
}
