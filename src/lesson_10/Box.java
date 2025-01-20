package lesson_10;

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
        if (box.isEmpty()) return 0;
        double weightOfFruit = box.getFirst().getWeight();
        return (double) box.size() * weightOfFruit;
    }

    public boolean compare(Box<?> box2) {
        boolean isTheSame = false;
        if (Math.abs(this.getWeight() - box2.getWeight()) < 0.0001) {
            isTheSame = true;
        }
        return isTheSame;
    }

    public Box<T> moveFruitsIntoThisBox(Box<T> box2) {
        if (getClass() == box2.getClass()) {
            this.box.addAll(box2.box);
            box2.box.clear();
        }
        return this;
    }

    public void addFruitIntoTheBox(T fruit) {
        box.add(fruit);
    }
}