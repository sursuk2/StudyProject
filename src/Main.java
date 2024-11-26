import lesson.Dog;

import java.util.Random;


public class Main {

    public static void main(String[] args) {
        //1 part
        Dog dog = new Dog();
        dog.setName("testName");
        System.out.println(dog.getName());
        dog.setAge(76584678);
        System.out.println(dog.getAge());

        //2 part
        int dogSum = dog.getSum(10, 3456789);

        //3 part
        Random rand = new Random();
        System.out.println("int " + rand.nextInt());
        System.out.println("Float " + rand.nextFloat());
        System.out.println("Double " + rand.nextDouble());

        System.out.println(Math.random());

        int number1 = rand.nextInt(1, 100);
        int number2 = rand.nextInt(1, 100);

        System.out.println(number1 + " + " + number2 + " = " + dog.getSum(number1, number2));

    }
}