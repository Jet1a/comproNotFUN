package qoute;

import java.util.*;

public class qoute {
    public static void main(String[] args) {
        String[] quotes = {
                "The greatest glory in living lies not in never falling, but in rising every time we fall.",
                "The future belongs to those who believe in the beauty of their dreams.",
                "The way to get started is to quit talking and begin doing.",
                "Life is what happens when you're busy making other plans.",
                "The world is a book and those who do not travel read only one page.",
                "Life is either a daring adventure or nothing at all.",
                "Your time is limited, don't waste it living someone else's life.",
                "The purpose of our lives is to be happy.",
                "I find that the harder I work, the more luck I seem to have.",
                "Don't let yesterday take up too much of today."
        };

        Scanner sc = new Scanner(System.in);
        String input = null;
        int lasted = -1;
        do {
            int random = (int) (Math.random() * quotes.length);
            if (random == lasted) {
                continue;
            }
            lasted = random;
            System.out.println(quotes[random]);
            System.out.print("Would you like to see another qoute? (Y/N) : ");
            input = sc.nextLine();

        } while (input == "Y");
    }
}
