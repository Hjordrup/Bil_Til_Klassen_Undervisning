package Bil;

public class carTest {

    public static void main(String[] args) {

        testSuite();


    }


    private static void testSuite() {
        System.out.println("Testsuiten kører");

        System.out.println("Test 1 correct nøgle -- ignition og engin skal være true");
        testStartCarGoodKey();
        System.out.println("***********************************************************");
        System.out.println();


        System.out.println("Test 2 forkert nøgle -- ignition og engin skal være false");
        testStartCarBadKey();
        System.out.println("***********************************************************");
        System.out.println();


        System.out.println("Test 3 test af lys med tændt mortor -- lights skal være true");
        testCarLightsWithMotorOn();
        System.out.println("***********************************************************");
        System.out.println();


        System.out.println("Test 4  test af lys med slukket mortor -- lights skal være false");
        testCarLightsWithMotorOff();
        System.out.println("***********************************************************");
        System.out.println();


        System.out.println("Test 5 slukning af lys med lys tændt -- lys skal være  false ");
        testTurnCarLightsOffWithLightsOn();
        System.out.println("***********************************************************");
        System.out.println();


        System.out.println("Test 6 slukning af lys med lys slukket -- lys skal være false");
        testTurnCarLightsOffWithLightsOff();
        System.out.println("***********************************************************");
        System.out.println();


        System.out.println("Test 7 test af pullhandbreak -- skal retunere håndbremsen er trukket i forvejen");
        testHandBreakOn();
        System.out.println("***********************************************************");
        System.out.println();


        System.out.println("Test 8 test af pullhandbreak -- skal give false");
        testHandBreakoff();
        System.out.println("***********************************************************");
        System.out.println();


        System.out.println("Test 9 test af vinduesvisker foran med tændt mortor  og en indstilling på 2 skal retunere frontWipers are on and speed is 2 ");
        testVindScreenWiperOnEnginOn();
        System.out.println("***********************************************************");
        System.out.println();


        System.out.println("Test 10 test af vinduesvisker foran med slukket mortor -- skal be om at tænde mortoren");
        testVindScreenWiperOnEnginOff();
        System.out.println("***********************************************************");
        System.out.println();


        System.out.println("Test 11 test af vinduesvisker bag bilen med tændt mortor  og en indstilling på 2 -- skal backWipers are on and their speed is 2");
        testVindScreenWiperOnEnginOnBack();
        System.out.println("***********************************************************");
        System.out.println();


        System.out.println("Test 12 test af vinduesvisker bagbilen med slukket mortor -- skal give Tænd mortoren for at startet viskerne ");
        testVindScreenWiperOnEnginOffBack();
        System.out.println("***********************************************************");
        System.out.println();


        System.out.println("Test 13 test af vinduskvisker off  foran med tændt visker  -- forventet svar er vinduevisker er nu slukket");
        testvindScreenWiperOffFront();
        System.out.println("************************************************");
        System.out.println();


        System.out.println("Test 14 test af vinduskvisker off  bagpå med tændt visker  -- forventet svar er vinduevisker er nu slukket");
        testvindScreenWiperOffBack();
        System.out.println("************************************************");
        System.out.println();


        System.out.println("Test 15 test af bilens fodbremse  i stille stående bil med et tryk på 2  -- forventet svar fodbremsen er nu 0" );
        testfootbreak();
        System.out.println("****************************************************************");
        System.out.println();


        System.out.println("Test 16 test af bilens speeder i stille stående bil -- forventet svar er bilens seeder er nul  " );
        testSpeedPedal();
        System.out.println("****************************************************************");
        System.out.println();


        System.out.println("Test 17 test af bilens Gear  i slukket bil -- forventet svar er at Gear ikke virker i en slukket bil " );
        testGear();
        System.out.println("****************************************************************");
        System.out.println();


        System.out.println("Test 18 test af bilens Gear i tændt stående bil -- Forventet svar er at Gear skifer fra 0 til 1 " );
        testGearOn();
        System.out.println("****************************************************************");
        System.out.println();


        System.out.println("Test 19 test af bilens Odometer i tændt stående bil -- forvetet svar er 0 i alle " );
        testOdometerOn();
        System.out.println("****************************************************************");
        System.out.println();


        System.out.println("Test 20 test af bil kan køre forventet at bilen har en hastighed -- forventet svar er at bilen nu er i først Gear med et tryk på 1 på speeder og bilen køre med 8 i hastighed" );
        testdrive();
        System.out.println("****************************************************************");
        System.out.println();


        System.out.println("Test 21 test af bilens RPM måler -- forventer RPM = 5600" );
        testRPM();
        System.out.println("****************************************************************");
        System.out.println();


    }

    private static void testRPM() {
        Car carFord = new Car();
        CarKey k1 = new CarKey("Anders");
        carFord.startEngin(k1);
        carFord.handbreakOff();
        System.out.println("this is the rpm before its changed " + carFord.getCurrentRPM());
        carFord.gaerShift(5);
        carFord.pressSpeedPedal(5);

        carFord.checkRPM();
        System.out.println("this is the rpm after its changed " + carFord.getCurrentRPM());
    }


    private static void testdrive() {
        System.out.println("Bile er i øjeblikket stille stående");
        Car carFord = new Car();
        CarKey k1 = new CarKey("Anders");
        carFord.startEngin(k1);
        carFord.handbreakOff();
        carFord.gaerShift(1);
        carFord.pressSpeedPedal(1);
        System.out.println("This is the Gear " + carFord.getCurrentGear());
        System.out.println("This is the SpeedPedal " + carFord.getSpeedPedal());
        System.out.println("This is the currentspeed " + carFord.getCurrentSpeed());



    }

    private static void testOdometerOn() {
        Car carFord = new Car();
        CarKey k1 = new CarKey("Anders");
        carFord.startEngin(k1);
        carFord.checkOdometer();


    }

    private static void testGearOn() {
        Car carFord = new Car();
        CarKey k1 = new CarKey("Anders");
        carFord.startEngin(k1);
        System.out.println("Dette er bilens Gear før der er sket noget " + carFord.getCurrentGear());
        carFord.gaerShift(1);
        System.out.println("Dette er bilens Gear efter der er blevet skftet " + carFord.getCurrentGear());

    }
    private static void testGear() {
        Car carFord = new Car();
        System.out.println("Dette er bilens Gear før der er sket noget " + carFord.getCurrentGear());
        carFord.gaerShift(1);
        System.out.println("Dette er bilens Gear efter der er blevet skftet " + carFord.getCurrentGear());
    }

    private static void testSpeedPedal() {
        Car carFord = new Car();
        System.out.println("Detter er speeder før der bliver trykket " + carFord.getSpeedPedal());
        carFord.pressSpeedPedal(0);
        System.out.println("Dette er speeder efter der er blevet trykket " + carFord.getSpeedPedal());


    }

    private static void testfootbreak() {
        Car carFord = new Car();
        System.out.println("Dette er bremsen før der bliver trykket " +  carFord.getBreakPedal());
        carFord.pressBreakPedal(2);
        System.out.println("Dette er fodbremsen efter " + carFord.getBreakPedal());

    }


    private static void testvindScreenWiperOffBack() {
        Car carFord = new Car();
        CarKey key = new CarKey("Anders");
        carFord.startEngin(key);
        carFord.vindScreenWiperOnBack(2);
        carFord.vindScreenWiperOffBack();
    }






    private static void testvindScreenWiperOffFront() {
        Car carFord = new Car();
        CarKey key = new CarKey("Anders");
        carFord.startEngin(key);
        carFord.vindScreenWiperOnFront(2);
        carFord.vindScreenWiperOffFront();
    }

    private static void testVindScreenWiperOnEnginOffBack() {
        Car carFord = new Car();
        CarKey key = new CarKey("1515");
        carFord.startEngin(key);
        carFord.vindScreenWiperOnBack(2);
    }

    private static void testVindScreenWiperOnEnginOnBack() {
        Car carFord = new Car();
        CarKey key = new CarKey("Anders");
        carFord.startEngin(key);
        carFord.vindScreenWiperOnBack(2);
    }

    private static void testVindScreenWiperOnEnginOn() {
        Car carFord = new Car();
        CarKey key = new CarKey("Anders");
        carFord.startEngin(key);
        carFord.vindScreenWiperOnFront(2);
    }



    private static void testVindScreenWiperOnEnginOff() {
        Car carFord = new Car();
        CarKey key = new CarKey("1515");
        carFord.startEngin(key);
        carFord.vindScreenWiperOnFront(2);
    }

    private static void testHandBreakoff() {
        Car carFord = new Car();
        carFord.handbreakOff();
    }

    private static void testHandBreakOn() {
        Car carFord = new Car();
        carFord.handBreakOn();
    }

    public static void testStartCarGoodKey() {
        Car carFord = new Car();
        CarKey key = new CarKey("Anders");
        carFord.startEngin(key);


    }

    public static void testStartCarBadKey() {
        Car carFord = new Car();
        CarKey key = new CarKey("1515");
        carFord.startEngin(key);


    }
    public static void testCarLightsWithMotorOn(){
        Car carFord = new Car();
        CarKey key = new CarKey("Anders");
        carFord.startEngin(key);
        carFord.startLights();

    }

    public static void testCarLightsWithMotorOff(){
        Car carFord = new Car();
        CarKey key = new CarKey("1515");
        carFord.startEngin(key);
        carFord.startLights();

    }

    public static void testTurnCarLightsOffWithLightsOn(){
        Car carFord = new Car();
        CarKey key = new CarKey("Anders");
        carFord.startEngin(key);
        carFord.startLights();
        carFord.endLights();


    }

    public static void testTurnCarLightsOffWithLightsOff(){
        Car carFord = new Car();
        CarKey key = new CarKey("1515");
        carFord.startEngin(key);
        carFord.endLights();

    }








}
