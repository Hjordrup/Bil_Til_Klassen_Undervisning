package Bil;

public class Car {

    // Data fields
    private int currentSpeed;
    private boolean ignition = false;
    private boolean engine = false;
    private boolean handbrake = true;
    public String neededPassword = "Anders";
    private boolean lights = false;
    private int frontWipers = 0;
    private int backWipers = 0;
    private int breakPedal = 0;
    private int speedPedal =0;
    private int currentGear = 0;
    private int currentRPM = 0;


    // Enums lavet for at vise hvad man kan bruge denne slags til.
    public CarColor color;
    public FrontLightColor frontLightColor;
    public EnginState enginState = EnginState.OFF;
    public Brand brand = Brand.Default;

    // constructor

    public Car() {
    }
    public Car(Brand brand) {
    }

    // Getters .

    public int getCurrentRPM() {
        return currentRPM;
    }

    public int getBreakPedal() {
        return breakPedal;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isIgnition() {
        return ignition;
    }

    public boolean isEngine() {
        return engine;
    }

    public boolean isHandbrake() {
        return handbrake;
    }

    public boolean isLights() {
        return lights;
    }

    public int getFrontWipers() {
        return frontWipers;
    }

    public int getBackWipers() {
        return backWipers;
    }

    public int getSpeedPedal() {
        return speedPedal;
    }

    public int getCurrentGear() {
        return currentGear;
    }


    // setters
    public void setCurrentRPM(int currentRPM) {
        this.currentRPM = currentRPM;
    }

    public void setLights(boolean lights) {
        this.lights = lights;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setIgnition(boolean ignition) {
        this.ignition = ignition;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void setHandbrake(boolean handbrake) {
        this.handbrake = handbrake;
    }

    public void setFrontWipers(int frontWipers) {
        this.frontWipers = frontWipers;
    }

    public void setBackWipers(int backWipers) {
        this.backWipers = backWipers;
    }

    public void setBreakPedal(int breakPedal) {
        this.breakPedal = breakPedal;
    }

    public void setSpeedPedal(int speedPedal) {
        this.speedPedal = speedPedal;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }



    //methods


    // This method Starts the engin if the right key is given.
    public void startEngin(CarKey key){
        if (key.password.equals(neededPassword)) {


            this.ignition = true;
            this.engine = true;
            enginState = EnginState.ON;
            System.out.println("bilens ignition == " + ignition);
            System.out.println("bilens engin == " + engine);
        }else {
            System.out.println("bilens ignition == " + engine);
            System.out.println("bilens engin == " + ignition);

        }

    }
    //This methos starts the lights on the car.
    public void startLights(){
        if(engine){
            setLights(true);
            System.out.println("bilens lys er nu tændt == " + lights);
        }else {
            System.out.println("bilens lys er ikke tændt check mortor == " + lights);
        }


    }
    // This method turns the light off.
    public void endLights(){
        if(lights){
            setLights(false);
            System.out.println("lysene er nu slukket == " + lights);
        }else System.out.println("lysene er slukket allerede "+ lights);

    }

    // This method changese the state of the hanbreak to on,
    public void handBreakOn() {
        if (!handbrake){
            setHandbrake(true);
            System.out.println("Nu er hånd bremsen trukket == " + handbrake);
            setCurrentSpeed(0);
            setCurrentGear(0);


        }else System.out.println("Håndbremsen er trukket i forvejen " + handbrake);
    }
    // This method changese the state of the hanbreak to off,
    public void handbreakOff() {
        if (handbrake){
            setHandbrake(false);
            System.out.println("Hånbremsen er nu slukket == " + handbrake);
        }else System.out.println("Håndbremsen er slukket i forvejen == " + handbrake);

    }
    // This method starts the front wipers
    public void vindScreenWiperOnFront(int speed) {
        if (engine && speed <=5 && speed >0){
            setFrontWipers(speed);
            System.out.println("frontWipers are on and their speed is " + frontWipers);
        }else System.out.println("Tænd mortoren for at startet viskerne eller vælge en hastighed bilen kan bruge");

    }
    // This method turns the front Wipers on
    public void vindScreenWiperOnBack(int speed) {
        if (engine && speed <=5 && speed >0){
            setBackWipers(speed);
            System.out.println("backWipers are on and their speed is " + backWipers);
        }else System.out.println("Tænd mortoren for at startet viskerne eller vælge en hastighed bilen kan bruge");

    }
    // This method turns the front Wipers off
    public void vindScreenWiperOffFront() {
        if (frontWipers>0){
            setFrontWipers (0);
            System.out.println(" viskerne foran er nu slukket og står på = " + frontWipers);

        }else System.out.println("viskerne er i forvejen slukket og står på = " + frontWipers);

    }
    // This method turns then back Wipers off
    public void vindScreenWiperOffBack() {
        if (backWipers>0){
            setBackWipers(0);
            System.out.println(" viskerne bagpå er nu slukket og står på = " + backWipers);

        }else System.out.println("viskerne er i forvejen slukket og står på = " + backWipers);

    }

    // This method engages the BreakPedal
    public void pressBreakPedal(int AmountOfBreaking) {
        if(AmountOfBreaking >= 5 ){
            if (getCurrentSpeed() > 0){
                while (getCurrentSpeed() > 0) {
                    setCurrentSpeed(getCurrentSpeed()-5);
                    System.out.println("this is the speed you are driving at"+ currentSpeed);
                }
            }
        }else if(AmountOfBreaking >= 4 ){
            if (getCurrentSpeed() > 0){
                while (getCurrentSpeed() > 0) {
                    setCurrentSpeed(getCurrentSpeed()-4);
                    System.out.println("this is the speed you are driving at"+ currentSpeed);
                }
            }
        }else if(AmountOfBreaking >= 3 ){
            if (getCurrentSpeed() > 0){
                while (getCurrentSpeed() > 0) {
                    setCurrentSpeed(getCurrentSpeed()-3);
                    System.out.println("this is the speed you are driving at"+ currentSpeed);
                }
            }
        }else if(AmountOfBreaking >= 2 ){
            if (getCurrentSpeed() > 0){
                while (getCurrentSpeed() > 0) {
                    setCurrentSpeed(getCurrentSpeed()-2);
                    System.out.println("this is the speed you are driving at"+ currentSpeed);
                }
            }
        }else if(AmountOfBreaking >= 1 ){
            if (getCurrentSpeed() > 0){
                while (getCurrentSpeed() > 0) {
                    setCurrentSpeed(getCurrentSpeed()-1);
                    System.out.println("this is the speed you are driving at"+ currentSpeed);
                }
            }
        }


    }

    // This method Engages the speedPedal
    public void pressSpeedPedal(int AmountOfSpeed) {
        if (engine && !handbrake && currentGear>0)
        if(AmountOfSpeed > 5 ){
            setSpeedPedal(5);
            setCurrentSpeed(currentGear * (speedPedal *8));
            setCurrentRPM(getCurrentSpeed()*28);
            System.out.println("Bilen er i bevægelse");
        }else if (AmountOfSpeed<0){
            setSpeedPedal(0);
        }else
            setSpeedPedal(AmountOfSpeed);
            setCurrentSpeed(currentGear * (speedPedal *8));
        setCurrentRPM(getCurrentSpeed()*28);



    }
    // This method starts the AutomatikGear
    public void gaerShift(int AutomatikGear) {
        if(engine) {
            if (AutomatikGear < 0) {
                setCurrentGear(0);
                setCurrentRPM(getCurrentSpeed()*28);
            } else if (AutomatikGear > 5) {
                setCurrentGear(5);
                setCurrentRPM(getCurrentSpeed()*28);
            } else setCurrentGear(AutomatikGear);
        }else System.out.println("Din bil er slukket så det automatiske gear virker ikke");


    }
    // This method calls the Odometer,
    public void checkOdometer() {
        System.out.println("Detter er bilens Gear " + currentGear);
        System.out.println("Dette er bilens Hastighed " + currentSpeed);
        System.out.println("This is the current RPM " + currentRPM);



    }

    // This method checks the RPM
    public void checkRPM() {
        setCurrentRPM(getCurrentSpeed()*28);

    }
}
