package homework1;

public class Treadmill implements Obstacle{

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public String nameObstacle() {
        return "беговая дорожка";
    }

    @Override
    public boolean isOvercome(Participant p) {
        return p.run() >= distance;
    }
}
