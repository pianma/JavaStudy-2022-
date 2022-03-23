package ex18;

public class Anonymous {
    Person field = new Person() {
        void work() {
            System.out.println("일을 합니다.");
        }

        @Override
        void WakeUp() {
            System.out.println("6시에 일어납니다.");
            work();
        };
    };

    void method1() {
        Person localVar = new Person() {
            void walk() {
                System.out.println("산책합니다.");
            }

            @Override
            void WakeUp() {
                System.out.println("7시에 일어납니다.");
                walk();
            }
        };
        localVar.WakeUp();
    }
}
