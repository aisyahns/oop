public class Manusia {

    private int usia;
    private String nama;
    private String jenisKelamin;

    public Manusia(){
        if (11 > 10){
            boolean a = ( 11 > 10 );
            System.out.println("lebih besar");
        }
    }

    public Manusia(int u){
        usia = usia;
    }

    public Manusia(int u, String n, String jnsKelamin){
        usia = usia;
        nama = n;
        jenisKelamin = jnsKelamin;
    }

    void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public int getUsia() {
        return usia;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    void bernafas(String nama){
        System.out.println(nama + " sedang bernafas");
    }

    void berbicara(String nama){
        System.out.println(nama + " sedang berbicara");
    }

    void kenalan(String nama){
        System.out.println("Halo nama aku " + nama);
    }

    public static void main(String[] args) {
        Manusia manusia1 = new Manusia(23, "Aisyah", "perempuan");
        Manusia manusia2 = new Manusia(11, "Merry", "perempuan");
        Manusia manusia3 = new Manusia();

//        manusia1.jenisKelamin = "Laki-laki";
//        manusia2.jenisKelamin = "perempuan";
//
//        System.out.println(manusia1.getJenisKelamin());
//        System.out.println((manusia2.getJenisKelamin()));

        manusia3.setNama("Ani");
        System.out.println(manusia3.getNama());

//        manusia3.setJenisKelamin("laki-laki");
//        manusia3.setNama("Raden");
//
//        manusia1.berbicara(manusia1.getNama());
////        manusia2.berbicara("Merry");
////        manusia3.berbicara(manusia3.getNama());
//
//        manusia1.kenalan(manusia1.getNama());
//        manusia2.kenalan(manusia2.getNama());
    }
}
