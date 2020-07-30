package RacingCars;

import com.sun.tools.javac.Main;

import javax.crypto.spec.PSource;
import java.util.Random;

import static RacingCars.Main.DISTANCE;
import static RacingCars.Main.STEP;

public class Car implements Runnable {
    // Khai báo Tên của xe đua
    private String name;
    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // Khởi tạo điểm start(hay km ban đầu)
        int runDistance = 0;
        //Khoi tao time bat dau cuoc dua
        long startTime = System.currentTimeMillis();

        //Kiem tra chung nao con xe chua ket thuc quang duong dua thi xe van tiep tuc chay
        while (runDistance < DISTANCE) {
            try {
                //Random speed km/h
                int speed = (new Random().nextInt(20));
                //Calculate traveled distance
                runDistance += speed;
                //Build result graphic
                String log = "|";
                int percentTravel = (runDistance * 100)/DISTANCE;
                for(int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log += "=";
                    }else if (percentTravel >= i && percentTravel < i + STEP) {
                        log += "o";
                    }else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.name + ":" + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                System.out.println();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.name + "broken... :(");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + "Finish in " + (endTime - startTime)/1000 + "s");
    }
}
