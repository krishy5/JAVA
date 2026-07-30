public class Methods {
    void printmsg(){ // Instance Method
        System.out.println("Hellow");
    }

    public static void a(){ // Static Method
        System.out.println("In A");
    }
    public static void b(){
        a();
        System.out.println("In B");
    }
    public static void c(){ //public static => we can call method without creating instance
        b();
        System.out.println("In C");
    }

    public static void main(String[] args) {
        Methods obj = new Methods();
        obj.printmsg();
        c();

    }
}
