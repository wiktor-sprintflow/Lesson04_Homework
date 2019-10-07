package task1;

public class TelevisorTest {
    public static void main(String[] args) {
        Televisor televisor1 = new Televisor();
        televisor1.showStatus();
        televisor1.turnOn();
        televisor1.showStatus();
        televisor1.turnOff();
        televisor1.showStatus();

        System.out.println();

        Televisor televisor2 = new Televisor(false);
        televisor2.showStatus();
        televisor2.turnOn();
        televisor2.showStatus();
        televisor2.turnOff();
        televisor2.showStatus();
    }
}
