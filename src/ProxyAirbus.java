/**
 * Created by Misha on 19.01.2017.
 */
public class ProxyAirbus implements Airplane {
    private Airbus airbus;
    private int flyNumber;

    public ProxyAirbus(int flyNumber) {
        this.flyNumber = flyNumber;
    }

    @Override
    public void fly() {
        if (airbus == null) {
            airbus = new Airbus(flyNumber);
        }
        airbus.fly();

    }

    @Override
    public void park() {
        if (airbus == null) {
            airbus = new Airbus(flyNumber);
        }
        airbus.park();
    }
}
