package main.randomtasks;

public class ClocksToAngle {
    public static void main(String[] args) {
        ClocksToAngle clock = new ClocksToAngle();
        double angle = clock.timeToAngle(13, 41);
        System.out.println(angle);
    }

    double timeToAngle(int h, int m) {
        double hAngle = (h % 12) * 30 + (m * .5);
        int mAngle = (m % 60) * 6;
        return Math.abs(hAngle - mAngle);
    }
}
