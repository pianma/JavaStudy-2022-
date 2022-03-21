package ex09;

public class DmbCellPhone extends CellPhone {

    int channel;

    DmbCellPhone(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    void turnOnDmb() {
        System.out.println("채널 " + channel + "번 수신");
    }

    void changeChannelDMB(int channel) {
        this.channel = channel;
        System.out.println("채널" + channel + "번으로 바꿉니다.");

    }

    void turnOff() {
        System.out.println("종료");
    }

}
