package shuttleBus;

public class BusMain {
    public static void main(String[] args) {
        ShuttleBus bus = new ShuttleBus("B#221",0,0);

        bus.lockDoors();
        bus.openFrontDoor();
        bus.addPassenger(2);
        bus.go();
        bus.lockDoors();
        System.out.println(bus);

    }
}
