public class Main {
    public static void main(String[] args) {

        Helicopter helicopter1 = new Helicopter();
        Helicopter helicopter2 = new Helicopter();

        helicopter1.setPosition(10, 20);
        helicopter1.setName("Apache");
        helicopter2.setPosition(20, 30);
        helicopter2.setName("Chinook");
        helicopter1.printPosition();
        helicopter2.printPosition();

helicopter1.goBack(10);
helicopter1.goUp(10);
helicopter2.goForward(10);
helicopter2.goDown(30);


        helicopter1.printPosition();
        helicopter2.printPosition();

    }

}
