package L;

public class Square extends Rectangle {
    @Override
    public void setX(int x) {
        super.setX(x);
    }

    @Override
    public void setY(int y) {
        super.setX(y);
        super.setY(y);
    }
}
