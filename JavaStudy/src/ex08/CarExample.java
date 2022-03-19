package ex08;

public class CarExample {
    public static void main(String[] args) {
        Car mycar = new Car();

        // 잘못된 속도 수정
        mycar.setSpeed(-40);
        System.out.println(mycar.getSpeed());

        // 정상적인 속도
        mycar.setSpeed(50);
        System.out.println(mycar.getSpeed());

        // 멈춤
        if (!mycar.isStop()) {
            mycar.setStop(true);
        }
        System.out.println(mycar.getSpeed());
    }
}
