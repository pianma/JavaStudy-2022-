package ex13;

public class PhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnon();
        smartPhone.internetSearch();
        smartPhone.turnoff();
    }
}
