// package Academy.1Week.java_essentials_two.src.objects;

public class HomeAreaCalculator {
    public static void main(String [] args) {

        Rectangle room1 = getRoom();;
        room1.setWidth(25);
        room1.setLentgth(50);
        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(length, width);
        double areaOfRoom2 = room2.calculateArea();

        Rectangle kitchen = new Rectangle(length, width);
    }

    public static double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

    public static Rectangle getRoom() {
        System.out.println("test");

    }
    
}
