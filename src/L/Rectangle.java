package L;

//Parent
public class Rectangle {
    private int x;
    private int y;

    //logic
    public long getPerimeter() {
        return 2L * x + 2L * y;
    }

    //10 methods

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
