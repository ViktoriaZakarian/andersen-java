package lesson_9;

public class Plate {

    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public int decreaseFood(int n) {
        return food -= n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFoodToThePlate(int extraFood) {
        food += extraFood;
    }
}
