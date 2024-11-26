import lesson.Dog;

public class Main {

    public static void main(String[] args) {

        //1 part
        Dog dog = new Dog();
        dog.setName("testName");
        System.out.println(dog.getName());
        dog.setAge(76584678);
        System.out.println(dog.getAge());

        //2 part
        int sumFromDog = dog.getSum(5, 9);
    }
}