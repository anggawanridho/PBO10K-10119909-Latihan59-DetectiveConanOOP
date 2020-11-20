package detective_conan;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class RanMouri extends DetectiveConan {
    private String namaAyah;
    private String profesiAyah;
    private String namaIbu;
    private String profesiIbu;
    private String tujuan;
    private String karakter;
    private String keahlian;

    public RanMouri(String nama, String profesi, String status, String peran, int umur, String jenisKelamin){
        super(nama,profesi,status,peran,umur,jenisKelamin);
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

    public String getTujuan(){
        return tujuan;
    }

    public void setTujuan(String tujuan){
        this.tujuan = tujuan;
    }

    public String getKarakter(){
        return karakter;
    }

    public void setKarakter(String karakter){
        this.karakter = karakter;
    }

    public String getKeahlian(){
        return keahlian;
    }

    public void setKeahlian(String keahlian){
        this.keahlian = keahlian;
    }

    @Override
    public void tampilKeterangan(String keterangan){
        System.out.println("Nama Ayah\t\t: " + getNamaAyah());
        System.out.println("Profesi Ayah\t: " + getProfesiAyah());
        System.out.println("Nama Ibu\t\t: " + getNamaIbu());
        System.out.println("Profesi Ibu\t\t: " + getProfesiIbu());
        System.out.println("Tujuan\t\t\t: " + getTujuan());
        System.out.println("Karakter\t\t: " + getKarakter());
        System.out.println("Keahlian\t\t: " + getKeahlian());
        System.out.println("Keterangan\t\t: " + keterangan);
    }
}
