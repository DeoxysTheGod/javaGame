package fr.RpgGame.interfaces;

import java.util.Scanner;

public interface PlayerInput {

    String separator = "---------------------------------------\n";

    /**
     * This function clear the prompt
     */
    static void clear() {
        for (int i = 0; i < 25; i++) {
            System.out.println();
        }
    }

    /**
     * Display a choice with integer answer
     *
     * @param sentenceToShow the sentence to show before the choice
     * @param choiceList the differents choices
     * @return the input of the player
     */
    static int choice(String sentenceToShow, String[] choiceList) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.print(separator);
        System.out.print(sentenceToShow + "\n");
        for (int i = 0; i < choiceList.length-1; i++) {
            sb.append(i + " - " + choiceList[i] + "\n");
        }
        sb.append(choiceList.length - 1 + " - " + choiceList[choiceList.length - 1]);
        System.out.println(sb.toString());
        System.out.print(separator);

        int answer;
        do {
            System.out.print("Quel est votre choix ? : ");
            answer = in.nextInt();
        } while (answer < 0 || answer > choiceList.length);
        System.out.print(separator);
        return answer;
    }

    /**
     * Display a choice which need a String input
     *
     * @param sentenceToShow the sentence to show before the choice
     * @return the String enterred by the player
     */
    static String getAString(String sentenceToShow) {
        System.out.print(separator);
        Scanner in = new Scanner(System.in);
        System.out.print(sentenceToShow);
        return in.nextLine();
    }
}
