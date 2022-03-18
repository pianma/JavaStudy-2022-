package ex02;

public class Car {
    int speed;

    int getspeed() {
        this.speed = 15;
        return speed;
    }

    void keyTurn() {
        System.out.println("키를 돌림.");
    }

    void run() {
        for (int i = 0; i <= 50; i += 10) {
            speed = i;
            System.out.println("시속 : " + speed + "입니다.");
        }
    }
}
