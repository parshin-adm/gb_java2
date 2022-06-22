package homework1;

import java.awt.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {


    public static void main(String[] args) {
        Cat cat = new Cat("Мурка", 100, 5);
        Human human = new Human("Адам", 500, 2);
        Robot robot = new Robot("Бендер", 1000, 1);

        Treadmill treadmill1 = new Treadmill(200);
        Treadmill treadmill2 = new Treadmill(500);
        Wall wall1 = new Wall(1);
        Wall wall2 = new Wall(2);

        Motion[] motions = {cat, human, robot};
        Obstacle[] obstacles = {treadmill1,  treadmill2, wall1, wall2};
        for (Motion m : motions) {
            for(Obstacle o : obstacles) {
                if(o.isOvercome(m)) {
                    System.out.println("Препятствие пройдено");
                }
                else {
                    System.out.println("Участник сошел с дистанции");
                    break;
                }
            }
        }


    }
}
