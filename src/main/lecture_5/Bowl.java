package src.main.lecture_5;

public class Bowl {
    private int foodAmount; // ���������� ��� � �����

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public boolean decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void addFood(int amount) {
        foodAmount += amount;
        System.out.println("� ����� ��������� " + amount + " ���. ������ � ����� " + foodAmount + " ���.");
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
