package detective_conan;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class AiHaibara extends DetectiveConan {
    private String namaAsli;
    private int umurAsli;
    private String namaAyah;
    private String profesiAyah;
    private String namaIbu;
    private String profesiIbu;
    private String karakter;

    public AiHaibara(String nama, String profesi, String status, String peran, int umur, String jenisKelamin){
        super(nama,profesi,status,peran,umur,jenisKelamin);
    }

    public String getNamaAsli(){
        return namaAsli;
    }

    public void setNamaAsli(String namaAsli){
        this.namaAsli = namaAsli;
    }

    public int getUmurAsli(){
        return umurAsli;
    }

    public void setUmurAsli(int umurAsli){
        this.umurAsli = umurAsli;
    }

    public String getNamaAyah(){
        return namaAyah;
    }

    public void setNamaAyah(String namaAyah){
        this.namaAyah = namaAyah;
    }

    public String getProfesiAyah(){
        return profesiAyah;
    }

    public void setProfesiAyah(String profesiAyah){
        this.profesiAyah = profesiAyah;
    }

    public String getNamaIbu(){
        return namaIbu;
    }

    public void setNamaIbu(String namaIbu){
        this.namaIbu = namaIbu;
    }

    public String getProfesiIbu(){
        return profesiIbu;
    }

    public void setProfesiIbu(String profesiIbu){
        this.profesiIbu = profesiIbu;
    }

    public String getKarakter(){
        return karakter;
    }

    public void setKarakter(String karakter){
        this.karakter = karakter;
    }

    @Override
    public void tampilKeterangan(String keterangan){
        System.out.println("Nama asli\t\t: " + getNamaAsli());
        System.out.println("Umur asli\t\t: " + getUmurAsli() + " tahun");
        System.out.println("Nama Ayah\t\t: " + getNamaAyah());
        System.out.println("Profesi Ayah\t: " + getProfesiAyah());
        System.out.println("Nama Ibu\t\t: " + getNamaIbu());
        System.out.println("Profesi Ibu\t\t: " + getProfesiIbu());
        System.out.println("Karakter\t\t: " + getKarakter());
        System.out.println("Keterangan\t\t: " + keterangan);
    }
}
