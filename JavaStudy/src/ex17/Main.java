package ex17;

public class Main {
    public static void main(String[] args) {
        A a = new A();

        A.B b = a.new B();

        b.field = 3;
        b.method1(3);
    }
}
