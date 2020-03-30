package homework3_1.fruitBox;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitList = new ArrayList<>();
    private static final int MAX_WEIGHT = 100;

    public void addFruit(T fruit) {
        if (getWeight() + fruit.getFruitWeight() > MAX_WEIGHT) {
            System.out.println("Превышен вес коробки !");
            return;
        }
        fruitList.add(fruit);
    }

    public int getWeight() {
        if (fruitList.size() == 0) {
            return 0;
        } else {
            return fruitList.get(0).getFruitWeight() * fruitList.size();
        }
    }

    public boolean compare(Box anotherBox) {
        int diff = this.getWeight() - anotherBox.getWeight();
        if (diff == 0) {
            return true;
        }
        return false;
    }

    public void transferToBox(Box<T> anotherBox) {
        if (this.getWeight() + anotherBox.getWeight() > MAX_WEIGHT) {
            System.out.println("Нельзя пересыпать фрукты в другую коробку. Превышен максимальный вес");
            return;
        }
        anotherBox.addAllFruits(this.fruitList);
        this.fruitList.clear();
    }

    private void addAllFruits(ArrayList<T> fruitAll) {
        this.fruitList.addAll(fruitAll);
    }
}
