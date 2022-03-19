package ex06;

public class SingleTon {
    private static SingleTon singleton = new SingleTon();

    static SingleTon getInstance() {
        return singleton;
    }
}
