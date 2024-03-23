package HomeWork;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float totalWeight = 0.0f;
        for (T fruit : fruits) {
            totalWeight += fruit.weight;
        }
        return totalWeight;
    }

    public boolean compare(Box<?> anotherBox) {
        return this.getWeight() == anotherBox.getWeight();
    }

    public void transferFruits(Box<T> anotherBox) {
        if (this.getClass() != anotherBox.getClass()) {
            System.out.println("Нельзя пересыпать в коробку с другими фруктами");
            return;
        }
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
