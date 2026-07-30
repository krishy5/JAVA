package JAVA;
abstract class Remote {
    abstract void powerOn();
}
class SonyTV extends Remote {
    void powerOn() {
        System.out.println("Sony TV ON");
    }
}
class LGTV extends Remote {
    void powerOn() {
        System.out.println("LG TV ON");
    }
    public static void main(String[] args) {
        Remote rr = new LGTV();
        rr.powerOn();
        Remote rs = new SonyTV();
        rs.powerOn();

    }
}
