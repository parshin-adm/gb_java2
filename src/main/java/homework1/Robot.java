package homework1;

public class Robot implements Motion{

    private String name;
    private int distance;
    private int height;

    public Robot(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    @Override
    public int run() {
        System.out.println("Робок - " + name + " собирается бежать");
        return distance;
    }

    @Override
    public int jump() {
        System.out.println("Робот - " + name + " собирается прыгать");
        return height;
    }
}
