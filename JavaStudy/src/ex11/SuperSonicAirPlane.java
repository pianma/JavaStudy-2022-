package ex11;

public class SuperSonicAirPlane extends AirPlane {
    public static final int NorMal = 1;
    public static final int SUPERSONIC = 2;

    public int flymode = NorMal;

    @Override
    public void fly() {
        if (flymode == SUPERSONIC) {
            System.out.println("초음속비행합니다.");
        } else {
            super.fly();
        }
    }
}
