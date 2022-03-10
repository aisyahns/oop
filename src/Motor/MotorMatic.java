package Motor;

public class MotorMatic extends Motor {

    void suara(){
        System.out.println("brum brum");
    }

    public void myname(){
        System.out.println("my name is motor matic");
    }

    void setLisensi(String l){
        lisensi = l;
    }

    String getLisensi(){
        return lisensi;
    }
}
