package L;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(); //не можем заменить на Square, меняется результат
        rectangle.setX(5);
        rectangle.setY(3);
        System.out.println(rectangle.getPerimeter());
        rectangle.setX(7);
        System.out.println(rectangle.getPerimeter());
    }
}
