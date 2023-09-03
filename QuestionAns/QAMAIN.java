package QuestionAns;

import java.util.Scanner;

public class QAMAIN {
    public static void main(String[] args) {

        Choice a = new Choice(1, "car");
        Choice b = new Choice(2, "dog");
        Choice c = new Choice(3, "cat");
        Choice d = new Choice(4, "rat");

        a.isMatch(b);

        Question qa = new Question(" What is not an animal ? ", 1, 4);

        qa.addChoice(1, "P'Tiw");
        qa.addChoice(2, "Dog");
        qa.addChoice(3, "Cat");
        qa.addChoice(4, "Rat");

        qa.addChoice(5, "Cow");
        qa.replaceChoice(3, "Tiger");
        qa.setCorrectAnswer(a);
        System.out.println("*******************************************");
        System.out.println("");
        System.out.println(qa);
        System.out.println("");
        System.out.println("*******************************************");

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter your choice (1,2,3,4) : ");
        int userChoice = sc.nextInt();

        Choice userChoiceObject = null;

        if (userChoice == 1) {
            userChoiceObject = a;
        } else if (userChoice == 2) {
            userChoiceObject = b;
        } else if (userChoice == 3) {
            userChoiceObject = c;
        } else if (userChoice == 4) {
            userChoiceObject = d;
        }

        qa.checkAnswer(userChoiceObject);
        System.out.println("**************************************" + "\n" + "Thank for playing <3");

    }
}
