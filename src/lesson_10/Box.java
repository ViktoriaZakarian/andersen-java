package lesson_10;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> box;

    public Box(List<T> box) {
        this.box = box;
    }

    public List<T> getBox() {
        return box;
    }

    public void setBox(List<T> box) {
        this.box = box;
    }

    public double getWeight() {
        double weightOfFruit = 0;
        if (box.getFirst() instanceof Orange) {
            weightOfFruit = Orange.WEIGHT;
        } else if (box.getFirst() instanceof Apple) {
            weightOfFruit = Apple.WEIGHT;
        } else {
            System.out.println("В коробке нет ни яблок, ни апельсинов");
        }
        return (double) box.size() * weightOfFruit;
    }

    public boolean compare(Box<?> box2) {
        boolean isTheSame = false;
        if (this.getWeight() == box2.getWeight()) {
            isTheSame = true;
        }
        return isTheSame;
    }

    public Box<T> moveFruitsIntoThisBox(Box<T> box2) {
        if (getClass() == box2.getClass()) {
            box.addAll(box2.getBox());
            box2.getBox().removeAll(box2.getBox());
        }
        return this;
    }

    public void addFruitIntoTheBox(T fruit) {
        box.add(fruit);
    }
}
