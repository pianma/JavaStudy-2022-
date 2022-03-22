package ex15;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rm = new Television();

        rm.turnOn();
        rm.setVolume(9);
        rm.turnOff();
    }
}
