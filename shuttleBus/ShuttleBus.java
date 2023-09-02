package shuttleBus;

public class ShuttleBus {
    private String busId;
    private int frontDoor;
    private int rearDoor;
    private int noOfPassengers;
    private int odometer;
    private int money;


    public ShuttleBus(){

    }
    public ShuttleBus(String busId) {
        this.busId = busId;
    }

    public ShuttleBus(String busId,int odometer) {
        this.busId = busId;
        this.odometer = odometer;
    }

    public ShuttleBus(String busId, int odometer, int money) {
        this.busId = busId;
        this.odometer = odometer;
        this.money = money;
    }
    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public void closeFrontDoor(){
        frontDoor = 1;
    }
    public void openFrontDoor(){
        frontDoor = 0;
    }
    public void closeRearDoor(){
        rearDoor = 1;
    }
    public void openRearDoor(){
        rearDoor = 0;
    }
    public void lockDoors(){
        frontDoor = 2;
        rearDoor = 2;
    }
    public void addPassenger(int passengers){
        noOfPassengers+= passengers;
        incrementMoney(money);
    }
    public void incrementMoney(int money){
        money = noOfPassengers*7;
        this.money += money;
    }
    public int getMoney(){
        return money;
    }
    public void go(){
        incrementOdometer();
    }
    public void incrementOdometer(){
        odometer+=800;
    }
    public void resetMoney(){
        money = 0;
    }
    public String getFrontDoor() {
        if (frontDoor == 0) {
            return "opened";
        } else if (frontDoor == 1) {
            return "closed";
        } else if (frontDoor == 2) {
            return "locked";
        } else {
            return "unknown";
        }
    }
    public String getRearDoor() {
        if (rearDoor == 0) {
            return "opened";
        } else if (rearDoor == 1) {
            return "closed";
        } else if (rearDoor == 2) {
            return "locked";
        } else {
            return "unknown";
        }
    }

    @Override
    public String toString() {
        return "ShuttleBus{" +
                "busId='" + busId + '\'' +
                ", frontDoor=" + getFrontDoor() +
                ", rearDoor=" + getRearDoor() +
                ", noOfPassengers=" + noOfPassengers +
                ", odometer=" + odometer +
                ", money=" + money +
                '}';
    }
}
