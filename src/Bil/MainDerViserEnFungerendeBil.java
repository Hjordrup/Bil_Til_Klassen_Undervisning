package Bil;

public class MainDerViserEnFungerendeBil {

    public static void main(String[] args) {

        Car Kia = new Car();
        CarKey k1 = new CarKey("Anders");

        Kia.startEngin(k1);
        Kia.startLights();
        Kia.vindScreenWiperOnFront(5);
        Kia.vindScreenWiperOnBack(5);
        Kia.handbreakOff();

        System.out.println();
        Kia.gaerShift(5);
        Kia.pressSpeedPedal(5);
        Kia.checkOdometer();

        System.out.println();
        Kia.gaerShift(5);
        Kia.pressSpeedPedal(4);
        Kia.checkOdometer();

        System.out.println();
        Kia.gaerShift(5);
        Kia.pressSpeedPedal(5);
        Kia.checkOdometer();
        Kia.pressBreakPedal(5);

    }

}
