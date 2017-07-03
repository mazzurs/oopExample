package sample;

/**
 * Created by Сергей on 03.07.2017.
 */
public class Mavic_2 extends Mavic_1 {

    private static final int MAX_SPEED = 60;
    private static final int SPEED_STEP = 5;

    private int flightSpeed = 0;


    @Override
    void on(){
        System.out.println("Mavic_2 ввімкнувся");
    }
    @Override
    void off(){
        System.out.println("Mavic_2 вимкнувся");
    }

    void hangs(){
        System.out.println("Mavic_2 завис у повітрі");
    }

    public void increaseSpeed() {
        if (flightSpeed >= MAX_SPEED) return;
        this.flightSpeed += SPEED_STEP;
    }

    public void reduceSpeed() {
        if (flightSpeed == 0) return;
        this.flightSpeed -= SPEED_STEP;
    }

    public int getSpeed() {
        return this.flightSpeed;
    }
}
