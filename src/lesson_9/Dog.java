package lesson_9;

import java.util.List;

public class Dog extends Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run(int length) {
        if (length > 500) {
            System.out.println(name + " не может пробежать больше 500 м");
        } else {
            System.out.print(name);
            super.run(length);
        }
    }

    @Override
    public void swim(int length) {
        if (length > 10) {
            System.out.println(name + " не может проплыть больше 10 м");
        } else {
            System.out.print(name);
            super.swim(length);
        }
    }

    public static int counterOfDogs(List<Animal> animals) {
        int counter = 0;
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                counter++;
            }
        }
        return counter;
    }
}
