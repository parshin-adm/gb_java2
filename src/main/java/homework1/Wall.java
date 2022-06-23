package homework1;

public class Wall implements Obstacle{

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public String nameObstacle() {
        return "стена";
    }

    @Override
    public boolean isOvercome(Participant p) {
        return p.jump() >= height;
    }
}
