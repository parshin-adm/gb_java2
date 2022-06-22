package homework1;

public class Human implements Motion {

    private String name;
    private int distance;
    private int height;

    public Human(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    @Override
    public int run() {
        System.out.println("Человек - " + name + " собирается бежать");
        return distance;
    }

    @Override
    public int jump() {
        System.out.println("Человек - " + name + " собирается прыгать");
        return height;
    }
}
