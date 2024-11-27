package lesson;

import java.util.Random;

public class Lesson8 {

    private static Random rand = new Random();

    public static int getRandomStudent(int quantity) {
        return rand.nextInt(2, quantity);
    }
}
