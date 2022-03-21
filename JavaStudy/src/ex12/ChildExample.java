package ex12;

public class ChildExample {
    public static void main(String[] args) {

        Child child = new Child();
        Parent parent = child;

        parent.method01();
        parent.method02();
        child.method03();
    }
}
