package DataMap;

public class Person {

    private String name;
    private Integer umur;
    private String jenisKelamin;

    public String getName() {
        return name;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public Integer getUmur() {
        return umur;
    }

    public Person(String name, Integer umur, String jenisKelamin){
        this.name = name;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }
}
