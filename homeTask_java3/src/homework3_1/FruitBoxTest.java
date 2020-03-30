package homework3_1;

import homework3_1.fruitBox.Apple;
import homework3_1.fruitBox.Box;
import homework3_1.fruitBox.Orange;

public class FruitBoxTest {
    public static void main(String[] args) {
        Box<Apple> box_1 = new Box<>();
        box_1.addFruit(new Apple());
        box_1.addFruit(new Apple());
        box_1.addFruit(new Apple());
        box_1.addFruit(new Apple());

        System.out.println(String.format("В коробке box_1 %d кг яблок", box_1.getWeight()));

        Box<Apple> box_2 = new Box<>();
        box_2.addFruit(new Apple());
        box_2.addFruit(new Apple());
        box_2.addFruit(new Apple());
        box_2.addFruit(new Apple());

        System.out.println(String.format("В коробке box_2 %d кг яблок", box_2.getWeight()));

        Box<Orange> box_3 = new Box<>();
        box_3.addFruit(new Orange());
        box_3.addFruit(new Orange());
        box_3.addFruit(new Orange());
        box_3.addFruit(new Orange());

        System.out.println(String.format("В коробке box_3 %d кг апельсинов", box_3.getWeight()));

        if (box_1.compare(box_2)) {
            System.out.println("Коробки box_1 и box_2 равны по весу");
        } else {
            System.out.println("Коробки box_1 и box_2 не равны по весу");
        }

        if (box_1.compare(box_3)) {
            System.out.println("Коробки box_1 и box_3 равны по весу");
        } else {
            System.out.println("Коробки box_1 и box_3 не равны по весу");
        }

        System.out.println("Переместим яблоки из box_2 в box_1");
        box_2.transferToBox(box_1);
        System.out.println(String.format("В коробке box_1 %d кг яблок", box_1.getWeight()));
        System.out.println(String.format("В коробке box_2 %d кг яблок", box_2.getWeight()));
    }
}
