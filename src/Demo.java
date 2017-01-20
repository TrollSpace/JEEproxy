/**
 * Created by Misha on 19.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Airplane airplane = new ProxyAirbus(123);
        airplane.fly();
        System.out.println();
        airplane.fly();
    }
}
