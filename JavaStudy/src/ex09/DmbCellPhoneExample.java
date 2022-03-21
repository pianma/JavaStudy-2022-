package ex09;

public class DmbCellPhoneExample {

    public static void main(String[] args) {

        DmbCellPhone dmbcellPhone = new DmbCellPhone("모토로라", "검정", 50);

        System.out.println("모델 : " + dmbcellPhone.model);
        System.out.println("색상 : " + dmbcellPhone.color);
        System.out.println("채널 : " + dmbcellPhone.channel);

        dmbcellPhone.powerOn();
    }
}
