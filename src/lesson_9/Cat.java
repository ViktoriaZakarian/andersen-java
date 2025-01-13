package lesson_9;

import java.util.List;

public class Cat extends Animal {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    @Override
    public void run(int length) {
        if (length > 200) {
            System.out.println("Кот не может пробежать больше 200 м");
        } else {
            super.run(length);
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Кот  не умеет плавать");
    }

    public static int counterOfCats(List<Animal> animals) {
        int counter = 0;
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                counter++;
            }
        }
        return counter;
    }

    public void eat(Plate plate) {
        if (appetite > plate.getFood()) {
            System.out.println("В миске не хватает еды");
        } else {
            plate.decreaseFood(appetite);
        }
    }

    public boolean isTheCatFull(Plate plate) {
        if (plate.decreaseFood(appetite) >= 0) {
            satiety = true;
        }
        return satiety;
    }

    public void infoAboutSatietyOfCats(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println("Кот " + name + " сыт: " + isTheCatFull(plate, cat));
        }
    }
}
