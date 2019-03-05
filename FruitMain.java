package Fruit;

public class FruitMain {
    public static void main(String args[]){

        Fruit f1= new Fruit(111,"orange","saffron");
        System.out.println("Fruit details are:" + f1.getFruitID() + " " + f1.getFruitName() + " " + f1.getFruitColor());

        Fruit f2=new Fruit( );
        f2.setFruitID(112);
        f2.setFruitName("apple");
        f2.setFruitColor("red");
        System.out.println("Fruit details are:" + f2.getFruitID() + " " + f2.getFruitName() + " " + f2.getFruitColor());


    }
}
