/**
 * Created by Misha on 19.01.2017.
 */
public class Airbus implements Airplane {
    private int flyNumber;

    public Airbus(int flyNumber){
        this.flyNumber = flyNumber;
        cleanSecondFloor(flyNumber);
    }


    @Override
    public void fly() {
        System.out.println("Fly " + flyNumber + " in the sky.");
    }

    @Override
    public void park() {
        System.out.println(flyNumber + "arrivel Pulkovo.");
    }

    private void cleanSecondFloor(int flyNumber){
        System.out.println(flyNumber + " ready to go.");
    }
}
