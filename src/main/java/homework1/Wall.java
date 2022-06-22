package homework1;

public class Wall implements Obstacle{

    private int height;

    public Wall(int height) {
        this.height = height;
    }


    @Override
    public boolean isOvercome(Motion motion) {
        return motion.jump() >= height;
    }
}
