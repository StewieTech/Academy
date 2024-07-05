package com.bptn.course.week4;

import java.util.*;
import java.io.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class SpellChecker
{
    private ArrayList<String> dictionary;

    public SpellChecker() throws IOException {
        // Let's use java.nio method readAllLines!
        List<String> lines = Files.readAllLines(Paths.get("dictionary.txt"));
        dictionary = new ArrayList<String>(lines);

    }

    /** This uses linear search to find a word
     * in the dictionary ArrayList and also
     * prints out the number of words checked.
     * If not found, word is misspelled.
     */
    public boolean linearSpellCheck(String word)
    {
        int count = 0;
        for(int i=0; i < dictionary.size(); i++)
        {
            count++;
            if (word.equals(dictionary.get(i))) {
                System.out.println("Number of words checked: " + count);
                return true;
            }
        }
        System.out.println("Number of words checked: " + count);
        return false;

    }

    /** This uses binary search to find a word
     * in the dictionary ArrayList.
     * If not found, word is misspelled.
     * ADD IN CODE TO COUNT and PRINT OUT THE NUMBER OF WORDS CHECKED!
     */
    public boolean binarySpellCheck(String word) {
        int count = 0;
        int left = 0;
        int right = dictionary.size() - 1;
        while (left <= right)
        {
            count++;
            int middle = (left + right) / 2;
            if (word.compareTo(dictionary.get(middle)) < 0)
            {
                right = middle - 1;
            }
            else if (word.compareTo(dictionary.get(middle)) > 0)
            {
                left = middle + 1;
            }
            else {
                System.out.println("Binary " + count);
                return true;
            }

        }
        System.out.println("Binary " + count);
        return false;
    }



}