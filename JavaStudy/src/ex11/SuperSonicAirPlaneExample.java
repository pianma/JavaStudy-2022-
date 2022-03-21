package ex11;

public class SuperSonicAirPlaneExample {
    public static void main(String[] args) {
        SuperSonicAirPlane sa = new SuperSonicAirPlane();

        sa.takeoff();
        sa.fly();
        sa.flymode = SuperSonicAirPlane.SUPERSONIC;
        sa.fly();
        sa.flymode = SuperSonicAirPlane.NorMal;
        sa.fly();
        sa.land();
    }
}
