package I;

public class Car implements Vehicle, Moveble {
    @Override
    public int getCost() {
        return 1000_000_000;
    }

    @Override
    public String getColor() {
        return "Green";
    }

    @Override
    public void start() {
        //логика по запуску машины
    }

    @Override
    public void end() {
        //логика по стопу
    }

    @Override
    public void getBrand() {
        System.out.println("BMW");
    }
}