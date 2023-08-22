package homework6;

public class Elevator {

    private int minFloor;
    private int maxFloor;
    private int floor;

    public Elevator(int minFloor, int maxFloor) {
        if (minFloor >= maxFloor) {
            throw new IllegalArgumentException("Невозможно установить шахту лифта, всего 1 этаж или шахта лифта вверх ногами");
        }

        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.floor = minFloor;
    }

    public Elevator(int maxFloor) {
        this(1, maxFloor);
    }

    public int getFloor() {
        return floor;
    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor) {
            throw new IllegalArgumentException("Такого этажа нет или лифт не может туда добраться");
        }
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "floor: '" + this.floor + "', minFloor: '" + this.minFloor + "', maxFloor: '" + this.maxFloor + "'";
    }
}
