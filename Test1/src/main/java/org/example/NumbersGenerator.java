package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class NumbersGenerator {
    public static void Generate(String filename) throws IOException {
        long[] numbers = new long[1000000];

        Random random = new Random();

        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

        for (int i = 0; i < numbers.length; i = i + 1) {
            numbers[i] = random.nextLong(1, 100000001);

            writer.write(String.valueOf(numbers[i]));
            writer.newLine();
        }

        writer.close();
    }
}
