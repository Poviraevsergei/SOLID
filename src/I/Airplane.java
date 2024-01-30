package I;

public class Airplane implements FlyI, Moveble, Vehicle {
    @Override
    public void fly() {
        //логика по полетам
    }

    @Override
    public void start() {
//логика по запуску
    }

    @Override
    public void end() {
//логика по стопу
    }

    @Override
    public int getCost() {
        return 0;
    }

    @Override
    public String getColor() {
        return "Blue";
    }

    @Override
    public void getBrand() {
        System.out.println("BMW");
    }
}
