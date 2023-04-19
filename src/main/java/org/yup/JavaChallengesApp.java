package org.yup;

//Doing this to show you an import for now, but this is not required since both are in the same package
import org.yup.Challenges;

public class JavaChallengesApp {


    public static void main(String [] args){

        //create a new instance of the challenges class so we can use the challenges in our application
        Challenges challenges = new Challenges();

        //this runs the greeting method from our challenges and returns a string greeting and stores it in the greeting variable we created
        //stores it in the greeting variable we created
        String greeting = challenges.greeting("anthony", 24);

        //this prints the greeting to the console

        //code below is running greetingWithUserInput()

//        System.out.println(greeting);
//        System.out.println(challenges.greetingWithUserInput());
//        System.out.println(challenges.addTwoNumbers());
//        System.out.println(challenges.subtractTwoNumbers());
//        System.out.println(challenges.multiplyTwoNumbers());

//        int interactiveCalculatorResult = challenges.interactiveCalculator();
//        System.out.println(interactiveCalculatorResult);



//        System.out.println(challenges.coinFlip());

//        System.out.println(challenges.findTheBiggestNumber());

//        System.out.println(challenges.findTheDifferenceBetweenTwoNumbers());

//        System.out.println(challenges.convertToUppercase());

//        System.out.println(challenges.convertToLowerCase());

        System.out.println(challenges.lengthOfWord());





    }



}
