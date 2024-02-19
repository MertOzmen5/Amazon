package Utility;

public class MyFunc {
    public static void main(String[] args) {


    }

    public static void Bekle(int sn) {

        try {
            Thread.sleep(sn * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
