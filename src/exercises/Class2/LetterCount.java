package exercises.Class2;

import java.util.ArrayList;
import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args){

        ArrayList<String> words = new ArrayList<>();
        String word;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("What is your word (or <ENTER> to finish)?");
            word = in.nextLine();
            words.add(word);
        } while (!word.isEmpty());

        for (String i : words){
            if (i.length() == 5) {
                System.out.println(i);
            }
        }

    }
}
