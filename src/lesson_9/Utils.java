package lesson_9;

import java.util.List;

public class Utils {

    public void counterOfAllAnimals(List<Animal> animals) {
        int counterOfDogs = Dog.counterOfDogs(animals);
        int counterOfCats = Cat.counterOfCats(animals);
        int counterOfOtherAnimals = animals.size() - counterOfDogs - counterOfCats;
    }
}
