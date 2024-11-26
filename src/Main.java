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
        int dogSum = dog.getSum(10, 3456789);
        System.out.println(dogSum);
    }
}