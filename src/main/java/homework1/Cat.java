package homework1;

import java.util.Objects;

public class Cat implements Participant {

    private String name;
    private int distance;
    private int height;


    public Cat(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    @Override
    public int run() {
        System.out.println("Кот - " + name + " собирается бежать");
        return distance;
    }

    @Override
    public int jump() {
        System.out.println("Кот - " + name + " собирается прыгать");
        return height;
    }

    @Override
    public String nameParticipant() {
        return name;
    }
}
