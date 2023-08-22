package homework6;

public class OOPMain {
    public static void main(String[] args) {

        Elevator elevator = new Elevator(2, 7);
        System.out.println(elevator.getFloor());
        elevator.move(4);
        System.out.println(elevator.getFloor());
        System.out.println(elevator);

        Elevator elevator2 = new Elevator(11);
        System.out.println(elevator2.getFloor());
        elevator2.move(9);
        System.out.println(elevator2.getFloor());
        System.out.println(elevator2);

//        elevator2.move(13);
        Elevator elevator3 = new Elevator(9, 3);
    }
}
