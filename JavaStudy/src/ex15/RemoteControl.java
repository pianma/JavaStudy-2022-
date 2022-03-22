package ex15;

public interface RemoteControl {

    // 상수필드
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

    // 추상 메소드
    void turnOn();

    void turnOff();

    void setVolume(int volume);
}
