package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BubbleSorter {

    public static long[] Read(String filename) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

        long[] numbers = new long[1000000];

        for (int i = 0; i < numbers.length; i = i + 1) {
            String line = bufferedReader.readLine();
            numbers[i] = Long.parseLong(line);
        }
        return numbers;
    }

    public static void BubbleSort(String filename) throws IOException {

        long[] numbers = Read(filename);

        for (int i = 0; i < numbers.length; i = i + 1) {
            for (int j = i + 1; j < numbers.length; j = j + 1) {
                long number = 0;
                if (numbers[i] > numbers[j]) {
                    number = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = number;
                }
            }
            System.out.println(i);
        }

        for (long number : numbers) {
            System.out.println(number);
        }
    }
}
