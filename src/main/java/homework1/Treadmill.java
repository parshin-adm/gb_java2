package homework1;

public class Treadmill implements Obstacle{

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }


    @Override
    public boolean isOvercome(Motion motion) {
        return motion.run() >= distance;
    }
}
