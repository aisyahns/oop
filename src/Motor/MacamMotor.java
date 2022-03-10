package Motor;

public class MacamMotor {

    public static void main(String[] args) {
        MotorMatic beat = new MotorMatic();
        MotorMoge ninja = new MotorMoge();

        beat.myname();
        String lisensi = beat.lisensi;
        beat.setLisensi("ADCNDFH");
        beat.suara();
        System.out.println(beat.getLisensi());

        ninja.myname();
        ninja.setLisensi("AHFUVFUV");
        ninja.suara();
        System.out.println(ninja.getLisensi());
    }
}
