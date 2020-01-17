package com.robertgeek27;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

/**
 * @author robert
 */
public class WordsAnalize {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give me the word to analize");
        String text = sc.nextLine();

        System.out.println("Give me the word to skip");
        String skip = sc.nextLine();
        String[] arraySkip = skip.toLowerCase().split("[\\W]+");

        WordsAnalize wa= new WordsAnalize();
        System.out.println(wa.analize(text, arraySkip));
    }

    public List<String> analize(String text, String[] arraySkip) {

        List<String> tList  = new ArrayList<>(Arrays.asList(text.toLowerCase().split("[\\W]+")));
        List<String> aList  = new ArrayList<>(Arrays.asList(arraySkip));
        Set<String> uniqueValues = new TreeSet<>();
        tList.removeAll(aList);
        aList = null;

        for (String word : tList) {
            if (Collections.frequency(tList, word) > 1) {
                uniqueValues.add(word);
            }
        }
        aList = new ArrayList<String>(uniqueValues);

        return aList;
    }
}
