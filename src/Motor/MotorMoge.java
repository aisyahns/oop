package Motor;

public class MotorMoge extends Motor{

    void suara(){
        System.out.println("roar roar roar");
    }

    void myname(){
        System.out.println("my name is motor moge");
    }

    void setLisensi(String l){
        lisensi = l;
    }

    String getLisensi(){
        return lisensi;
    }
}