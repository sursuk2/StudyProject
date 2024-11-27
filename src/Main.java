import lesson.Converter;
import lesson.Lesson8;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //1 part
        System.out.println(Lesson8.getRandomStudent(25));

        //2 part
        int a = 5;
        int b = 10;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a:" + a + " b:" + b);


        //3part
        Random random = new Random();
        double randomDouble = random.nextDouble() + random.nextInt(7, 456);

        System.out.println(Converter.runFahrenheitConverter(randomDouble));
        System.out.println(Converter.runKelvinConverter(randomDouble));
    }

}