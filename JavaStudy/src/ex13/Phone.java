package ex13;

public abstract class Phone {

    public String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public void turnon() {
        System.out.println("전원을 켭니다.");
    }

    public void turnoff() {
        System.out.println("전원을 끕니다.");
    }

}
