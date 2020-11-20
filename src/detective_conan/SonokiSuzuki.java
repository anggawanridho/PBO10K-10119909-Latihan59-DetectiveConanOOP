package detective_conan;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class SonokiSuzuki extends DetectiveConan {
    private String namaAyah;
    private String namaIbu;
    private String profesiAyah;
    private String profesiIbu;
    private String karakter;
    private String keterangan;

    public SonokiSuzuki(String nama, String profesi, String status, String peran, int umur, String jenisKelamin){
        super(nama,profesi,status,peran,umur,jenisKelamin);
    }

    public String getNamaAyah(){
        return namaAyah;
    }

    public void setNamaAyah(String namaAyah){
        this.namaAyah = namaAyah;
    }

    public String getNamaIbu(){
        return namaIbu;
    }

    public void setNamaIbu(String namaIbu){
        this.namaIbu = namaIbu;
    }

    public String getProfesiAyah(){
        return profesiAyah;
    }

    public String getProfesiIbu(){
        return profesiIbu;
    }

    public void setProfesiIbu(String profesiIbu){
        this.profesiIbu = profesiIbu;
    }
    public void setProfesiAyah(String profesiAyah){
        this.profesiAyah = profesiAyah;
    }

    public String getKarakter(){
        return karakter;
    }

    public void setKarakter(String karakter){
        this.karakter = karakter;
    }

    @Override
    public void tampilKeterangan(String keterangan){
        System.out.println("Nama Ayah\t\t: " + getNamaAyah());
        System.out.println("Profesi Ayah\t: " + getProfesiAyah());
        System.out.println("Nama Ibu\t\t: " + getNamaIbu());
        System.out.println("Profesi Ibu\t\t: " + getProfesiIbu());
        System.out.println("Karakter\t\t: " + getKarakter());
        System.out.println("Keterangan\t\t: " + keterangan);
    }
}
