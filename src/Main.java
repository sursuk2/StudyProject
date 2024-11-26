import lesson.Dog;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setName("testName");
        System.out.println(dog.getName());
        dog.setAge(76584678);
        System.out.println(dog.getAge());
    }
}