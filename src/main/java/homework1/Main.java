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
        //участники
        Cat cat = new Cat("Мурка", 100, 5);
        Human human = new Human("Адам", 500, 2);
        Robot robot = new Robot("Бендер", 1000, 1);

        //препятствия
        Treadmill treadmill1 = new Treadmill(200);
        Treadmill treadmill2 = new Treadmill(500);
        Wall wall1 = new Wall(1);
        Wall wall2 = new Wall(2);

        //массивы участников и препятствий
        Participant[] participants = {cat, human, robot};
        Obstacle[] obstacles = {treadmill1, wall1, treadmill2, wall2};

        //прохождение участниками препятствий
        int numberParticipant = 1;

        for (Participant p : participants) {
            System.out.printf("\nУчастник по имени %s и номером %d начал проходить полосу препятствий!\n",
                    p.nameParticipant(), numberParticipant);
            for (int i = 0; i < obstacles.length; i++) {
                if(obstacles[i].isOvercome(p)) {
                    System.out.println("Препятствие " + obstacles[i].nameObstacle() + " пройдено!");
                    if(i == obstacles.length - 1) {
                        System.out.println("Участник по имени " + p.nameParticipant() + " прошел полосу препятствий!" );
                        System.out.println("______________________________________");
                        break;
                    }
                }
                else {
                    System.out.printf("%s не прошел испытание - %s и поэтому выбывает с полосы препятствий☹\n",
                            p.nameParticipant(), obstacles[i].nameObstacle());
                    System.out.println("______________________________________");
                    break;
                }
            }
            numberParticipant++;

        }


    }
}
