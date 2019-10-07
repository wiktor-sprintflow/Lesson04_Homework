package task1;

public class Televisor {
    boolean isTurnedOn;

    public Televisor(boolean isTurnedOn) {
        this.isTurnedOn = isTurnedOn;
    }

    public Televisor() {
    }

    public void turnOn() {
        isTurnedOn = true;
    }

    public void turnOff() {
        isTurnedOn = false;
    }

    public void showStatus() {
        System.out.println("Telewizor jest włączony: (" + isTurnedOn + ")");
    }
}
