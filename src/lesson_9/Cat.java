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
            System.out.println(name + " не может пробежать больше 200 м");
        } else {
            System.out.print(name);
            super.run(length);
        }
    }

    @Override
    public void swim(int length) {
        System.out.println(name + " не умеет плавать");
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

    public int eat(Plate plate) {
        int leftOverFood = -1;
        if (appetite > plate.getFood()) {
            System.out.println("В миске не хватает еды");
        } else {
            leftOverFood = plate.decreaseFood(appetite);
            System.out.println("В миске осталось еды: " + leftOverFood);
        }
        return leftOverFood;
    }

    public static boolean isTheCatFull(Plate plate, Cat cat) {
        if (cat.eat(plate) >= 0) {
            cat.satiety = true;
        }
        return cat.satiety;
    }

    public static void infoAboutSatietyOfCats(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            if (isTheCatFull(plate, cat)) {
                System.out.println("Кот " + cat.name + " сыт");
            } else {
                System.out.println("Котику " + cat.name + " не хватило еды(");
            }
        }
    }
}
