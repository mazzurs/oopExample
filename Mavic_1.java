package sample;

/**
 * Created by Сергей on 03.07.2017.
 */
public class Mavic_1 {
    public int flightAltitude = 0;
    public int batteryCharge = 0;

    private static final int MAX_HEIGHT = 1000;
    private static final int STEP = 10;

    private int height = 0;

    void on(){
        System.out.println("Mavic_1 ввімкнувся");
    }
    void off(){
        System.out.println("Mavic_1 вимкнувся");
    }

    public void increaseHeight() {
        if (height >= MAX_HEIGHT) return;
        this.height += STEP;
    }

    public void reduceHeight() {
        if (height == 0) return;
        this.height -= STEP;
    }

    public int getHeight() {
        return this.height;
    }
}
