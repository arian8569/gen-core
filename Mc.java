

import java.util.Scanner;

public class Mc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Sc myObj = new Sc();

        System.out.print("Enter Your Name: ");
        String name = input.nextLine();

        System.out.print("Enter Your age: ");
        int age = input.nextInt();

        myObj.ko(name);
        myObj.ch(age);


    }
}
