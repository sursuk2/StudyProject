package lesson;

import java.util.Random;

public class Lesson8 {

    //1 part
    public static int getRandomStudent(int quantity) {
        Random random = new Random();
        return random.nextInt(2, quantity);
    }

    //*2 part*
    public static TwoNum doChange(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new TwoNum(a, b);
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        System.out.println(doChange(a, b));
    }
}
