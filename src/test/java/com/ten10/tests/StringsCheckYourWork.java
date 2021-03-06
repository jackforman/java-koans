package com.ten10.tests;

import com.ten10.training.Strings;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Jack Forman on 30/09/2016.
 */
public class StringsCheckYourWork {








    /*********************************************************************************************
     * DONT OPEN THIS FILE AS IT WILL BE LIKE OPENING ALL OF YOUR CHRISTMAS PRESENTS IN NOVEMBER
     *********************************************************************************************/
























    @Test
    public void printAStringTest(){
        Strings strings = new Strings();
        assertEquals("Try making the string being printed, as below","Hello World!", strings.printAString());
    }

    @Test
    public void charToStringTest(){
        Strings strings = new Strings();
        assertEquals("You'll need to add each character in to the charArray individually to make the expected below","Hello World!",strings.charToString());
    }

    @Test
    public void quoteMarksTest(){
        Strings strings = new Strings();
        assertEquals("You'll need to work out a way on including speach marks in a String",
                     "Jack said 'I love com.ten10.training.Strings in Java'",
                      strings.quoteMarks());
    }

    @Test
    public void partOfAStringTest(){
        Strings strings = new Strings();
        assertEquals("How can you just print the expected below",
                "789",
                strings.partOfAString());
    }

    @Test
    public void makeCollectionOfWordsTest(){
        Strings strings = new Strings();
        assertEquals("That's not my favourite bit!",
                "Bacon",
                strings.makeCollectionOfWords());
    }

    @Test
    public void splitWithoutCommaTest(){
        Strings strings = new Strings();
        assertEquals("That's not my favourite bit!",
                "Cucumber",
                strings.splitWithoutComma());
    }

    @Test
    public void joinCollectionsToStringTest(){
        Strings strings = new Strings();
        assertEquals("That's not my favourite bit!",
                "Fish & Chips & Peas & Curry Sauce",
                strings.joinCollectionsToString());
    }

    @Test
    public void reCaseStringsTest(){
        Strings strings = new Strings();
        assertEquals("What is the opposite of toUpperCase?",
                "this is a lower case string",
                strings.reCaseStrings());
    }
}
