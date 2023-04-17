package org.yup;

import java.util.Scanner;

public class Challenges {

    public String greeting(String name, int age){

        //let folks into the party if they are 21 and up
        //politely tell them they cannot enter, under age
        if(age >= 21){
            return "Hello " + name + ", welcome to the party!";
        }else{
            return "Hello " + name + ", I am sorry but we cannot let you into the party.";
        }
}

    public String greetingWithUserInput(){

        Scanner theScanner = new Scanner(System.in);

        //we need to ask the user what their name is
        System.out.print("Enter your name: ");
        String name = theScanner.nextLine();

        //we need to ask the user what their age is
        System.out.print("Enter your age: ");
        int age = theScanner.nextInt();

        //let folks into the party if they are 21 and up
        //politely tell them they cannot enter, under age
        if(age >= 21){
            return "Hello " + name + ", welcome to the party!";
        }else{
            return "Hello " + name + ", I am sorry but we cannot let you into the party.";
        }
    }

    public int addTwoNumbers(){
        Scanner theScanner = new Scanner(System.in);
        //ask the user for number 1
        System.out.print("Enter your first number: ");
        int number1 = theScanner.nextInt();

        //ask the user for number 2
        System.out.print("Enter your second number: ");
        int number2 = theScanner.nextInt();


        //return the sum of number 1 and number 2 together
        return number1 + number2;
    }

    public int subtractTwoNumbers(){
        Scanner theScanner = new Scanner(System.in);
        //ask the user for number 1
        System.out.print("Enter your first number: ");
        int number1 = theScanner.nextInt();

        //ask the user for number 2
        System.out.print("Enter your second number: ");
        int number2= theScanner.nextInt();


        //return the sum of number 1 and number 2 together
        return number1 - number2;
    }

    public int multiplyTwoNumbers(){
        Scanner theScanner = new Scanner(System.in);
        //ask the user for number 1
        System.out.print("Enter your first number: ");
        int number1 = theScanner.nextInt();

        //ask the user for number 2
        System.out.print("Enter your second number: ");
        int number2 = theScanner.nextInt();


        //return the sum of number 1 and number 2 together
        return number1 * number2;
    }


}
