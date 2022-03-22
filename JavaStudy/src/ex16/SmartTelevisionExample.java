package ex16;

public class SmartTelevisionExample {
    public static void main(String[] args) {
        SmartTelevision tv = new SmartTelevision();
        Searchable searchable = tv;
        RemoteControl rc = tv;

        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        searchable.search("http://www.naver.com");

    }
}
