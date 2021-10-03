package org.example;

import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {

        NumbersGenerator.Generate("Numbers.txt");
        BubbleSorter.BubbleSort("Numbers.txt");

    }
}


