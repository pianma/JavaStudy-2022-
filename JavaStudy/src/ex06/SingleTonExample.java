package ex06;

public class SingleTonExample {
    public static void main(String[] args) {

        SingleTon obj1 = SingleTon.getInstance();
        SingleTon obj2 = SingleTon.getInstance();
    }
}
