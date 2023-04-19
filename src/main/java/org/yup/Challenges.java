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

    public int interactiveCalculator(){

        //fire up scanner so we can use it
        Scanner theScanner = new Scanner(System.in);

        //displays some set of choices to the user
        System.out.println("Welcome to the calculator!");
        System.out.println("Press 1 to add numbers");
        System.out.println("Press 2 to subtract numbers");
        System.out.println("Press 3 to multiply numbers");
        System.out.print("Enter your selection and press ENTER: ");

        //this sits and waits for the user to give (1,2,3). when they hit enter their selection is stored in userSelection
        int userSelection = theScanner.nextInt();

        //creating a variable to store the result of the math
        int result;

        switch (userSelection){
            case 1:
                result = this.addTwoNumbers();
                break;
            case 2:
                result = this.subtractTwoNumbers();
                break;
            case 3:
                result = this.multiplyTwoNumbers();
                break;
            default:
                System.out.println("the user chose nonsense");
                result = 0;
        }

        return result;

    }

    public String coinFlip(){
        //attempt to flip a coin
        //return heads or tails

        //this is where we flip the coin
        if(Math.random() > .5){
            //here is where we return heads if the number generated was > .5
            return "heads";
        }else{
            //here is where we return tails if the number generated was < .5
            return "tails";
        }

    }

    public String findTheBiggestNumber(){

        //this is the scanner that lets us take input from the user
        Scanner theScanner = new Scanner(System.in);

        //this is where we ask the user for input
        System.out.print("Give me the first number please: ");
        //this is where we capture that input and store it in a variable called num1
        int num1 = theScanner.nextInt();

        //this is where we ask the user for input
        System.out.print("Give me the second number please: ");
        //this is where we capture that input and store it in a variable called num1
        int num2 = theScanner.nextInt();

        int theBiggestNumber = Math.max(num1, num2);

        return "The biggest number between " + num1 + " and " + num2 + " is: " + theBiggestNumber;

    }

    public String findTheSmallestNumber(){

        //this is the scanner that lets us take input from the user
        Scanner theScanner = new Scanner(System.in);

        //this is where we ask the user for input
        System.out.print("Give me the first number please: ");
        //this is where we capture that input and store it in a variable called num1
        int num1 = theScanner.nextInt();

        //this is where we ask the user for input
        System.out.print("Give me the second number please: ");
        //this is where we capture that input and store it in a variable called num1
        int num2 = theScanner.nextInt();

        int theSmallestNumber = Math.max(num1, num2);

        return "The smallest number between " + num1 + " and " + num2 + " is: " + theSmallestNumber;

    }

    public String findTheDifferenceBetweenTwoNumbers(){

        Scanner theScanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = theScanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = theScanner.nextInt();
        int sum = num1 - num2;
        int theDifference = Math.abs(sum);
        return "The difference between " + num1 + " and " + num2 + " is: " + theDifference;

    }

    public String convertToUppercase(){

        Scanner theScanner = new Scanner(System.in);
        System.out.print("Provide a word to convert to all CAPS: ");
        String theWord = theScanner.nextLine();
        return "You provided, " + theWord + " and we converted it to: " + theWord.toUpperCase();

    }

    public String convertToLowerCase(){

        Scanner theScanner = new Scanner(System.in);
        System.out.print("Provide a word to convert to all lowercase: ");
        String theWord = theScanner.nextLine();
        return "You provided, " + theWord + " and we converted it to: " + theWord.toLowerCase();

    }

    public String lengthOfWord(){

        Scanner theScanner = new Scanner(System.in);
        System.out.print("Provide a word to output its length: ");
        String lengthWord = theScanner.nextLine();
        return "You provided " + lengthWord + " and we've determined it is " + lengthWord.length() + " letters long.";

    }

    public void countToTen(){

        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

    }


    //make a method that counts from 10 to 1
    //make a method that counts from 1 to 100 but in increments of 2
    //make a method that counts from 0 to 50 but only prints even numbers

    public void countFromTenToOne(){
        for(int i = 10; i >= 1; i--){
            System.out.println(i);
        }
    }

    public void countOneToHundred(){
        for(int i = 1; i <= 100; i += 2){
            System.out.println(i);
        }
    }

    public void countZeroToFifty(){
        for(int i = 0; i <= 50; i += 2){
            System.out.println(i);
        }
    }
    
}
