package QuestionAns;

import java.util.Arrays;

public class Question {
    private String question;
    private int complexityLevel;
    private Choice[] choices;
    private Choice correctAnswer;
    private int capacity;

    public Question() {

    }

    public Question(String question, int complexityLevel, int numOfChoices) {
        this.question = question;
        this.complexityLevel = complexityLevel;
        this.choices = new Choice[numOfChoices];
        this.capacity = 0;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getComplexityLevel() {
        return complexityLevel;
    }

    public void setComplexityLevel(int complexityLevel) {
        this.complexityLevel = complexityLevel;
    }

    public void setCorrectAnswer(Choice correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public boolean addChoice(int choiceNo, String choiceItem) {
        if (capacity < choices.length) {
            choices[capacity] = new Choice(choiceNo, choiceItem);
            capacity++;
            return true;
        } else {
            System.out.println("FUCK YOU");
            return false;
        }
    }

    public boolean replaceChoice(int choiceNo, String choiceItem) {
        if (choiceNo >= 1) {
            choices[choiceNo - 1] = new Choice(choiceNo, choiceItem);
            return true;
        } else {
            return false;
        }
    }

    public boolean checkAnswer(Choice userChoice) {
        if (userChoice == correctAnswer) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("Incorrect!");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Question {" +
                "question =' " + question + '\'' +
                ", complexityLevel=" + complexityLevel + "}" + "\n" +
                "choices = " + Arrays.toString(choices);
    }
}
