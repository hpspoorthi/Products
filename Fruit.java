package Fruit;

public class Fruit {
   private int fruitID;
   private String fruitName;
   private String fruitColor;

    public Fruit() {
    }

    public Fruit(int fruitID, String fruitName, String fruitColor) {
        this.fruitID = fruitID;
        this.fruitName = fruitName;
        this.fruitColor = fruitColor;
    }

    public int getFruitID() {
        return fruitID;
    }

    public void setFruitID(int fruitID) {
        this.fruitID = fruitID;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitColor() {
        return fruitColor;
    }

    public void setFruitColor(String fruitColor) {
        this.fruitColor = fruitColor;
    }
}
