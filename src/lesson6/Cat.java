package lesson6;
/*
Создайте класс Кот
Создайте конструктор по умолчанию
Создайте класс Тест
Создайте экземпляр класса Кот
Добавьте в класс Кот два конструктора с параметрами
Удалите конструктор по умолчанию
Удалите this из конструктора, переименуйте параметры
*/

public class Cat {

    int age;

    String name;

    public Cat(int age, String name) {
            this.age = age;
            this.name = name;
    }
    public Cat(String name) {
        this.name = name;
    }
    public Cat() {

    }

    @Override
    public String toString() {
        return "Kitty{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
