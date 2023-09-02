public class airMain {
    public static void main(String[] args) {
        airCondition Hatari = new airCondition(25,2);
        Hatari.turnAirOnOff();
        System.out.println(Hatari);
        Hatari.increaseTemperature();
        Hatari.changeFanSpeed();
        System.out.println(Hatari);
        Hatari.changeFanSpeed();
        System.out.println(Hatari);
        Hatari.turnAirOnOff();
        System.out.println(Hatari);
    }
}
