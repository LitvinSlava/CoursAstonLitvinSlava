package src.main.lecture_10.boxes;

import src.main.lecture_10.fruits.Fruit;
import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float totalWeight = 0.0f;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    // �������������� ����� pourTo � �������������� ��������� �����
    public <U extends Fruit> void pourTo(Box<U> destinationBox) {
        if (this == destinationBox) return;

        // �������� ������������� ����� �� ����� ����������
        if (!fruits.isEmpty() && !destinationBox.fruits.isEmpty()) {
            if (!fruits.get(0).getClass().equals(destinationBox.fruits.get(0).getClass())) {
                throw new IllegalArgumentException("Cannot mix different fruit types!");
            }
        }

        // �������� ����������� ����������� � ������� ����������
        if (!fruits.isEmpty() && destinationBox.fruits.isEmpty()) {
            // ���� �������� ������, ����� ���������� ������ ���� ���� ����������
            if (!Fruit.class.isAssignableFrom(fruits.get(0).getClass())) {
                throw new IllegalArgumentException("Incompatible fruit types!");
            }
        }

        // ���������� ���������� �����
        destinationBox.fruits.addAll((List<U>) new ArrayList<>(this.fruits));
        this.fruits.clear();
    }

    @Override
    public String toString() {
        if (fruits.isEmpty()) return "Empty box";
        String fruitType = fruits.get(0).getClass().getSimpleName();
        return fruitType + " box [fruits: " + fruits.size() +
                ", weight: " + getWeight() + "]";
    }
}