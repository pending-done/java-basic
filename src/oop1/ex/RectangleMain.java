package oop1.ex;

public class RectangleMain {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;

        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레: " + perimeter);

        boolean isSquare = rectangle.isSquare();
        System.out.println(isSquare);


    }
}
