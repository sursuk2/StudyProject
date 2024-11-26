package lesson;

public class Dog {

    private int age;

    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //2 part
    public int getSum(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }
}
