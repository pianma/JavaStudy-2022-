package ex17;

public class A {
    class B {
        int field;

        void method1(int n) {
            System.out.println("B생성");
            if (n > 0) {
                System.out.println("0보다 큽니다.");
            } else {
                System.out.println("0보다 크지 않습니다.");
            }
        }
    }
}
