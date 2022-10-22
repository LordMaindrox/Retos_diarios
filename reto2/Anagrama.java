

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Anagrama {

    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        String firstWord;
        String secondWord;
        System.out.println("Introduce a fist word to evaluate: ");
        firstWord = myObj.nextLine().toLowerCase().replace(" ", "");
        System.out.println("Introduce the second word to evaluate: ");
        secondWord = myObj.nextLine().toLowerCase().replace(" ","");

        if(firstWord.equals(secondWord) || firstWord == "" || secondWord == "" || firstWord.length() != secondWord.length()){
            System.out.println("It is not possible to do, is invalid word");
        }else{
            System.out.println("ok, the word is valid, wait");
            ArrayList<Character> cfirstWord = new ArrayList<Character>();
            ArrayList<Character> csecondWord = new ArrayList<Character>();
            for (int i = 0; i < firstWord.length(); i++) {
                char currentCharacter = firstWord.charAt(i);
                cfirstWord.add(currentCharacter);
            }
            for (int i = 0; i < secondWord.length(); i++) {
                char currentCharacter2 = secondWord.charAt(i);
                csecondWord.add(currentCharacter2);
            }

            Collections.sort(cfirstWord);
            Collections.sort(csecondWord);
            if (cfirstWord.equals(csecondWord)){
                System.out.println("Is Anagram");
            }else{
                System.out.println("Is not Anagram");
            }
            }

    }

}