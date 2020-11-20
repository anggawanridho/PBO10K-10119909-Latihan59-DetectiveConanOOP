package detective_conan;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class ConanEdogawa extends DetectiveConan {
    private String namaAsli;
    private String karakter;
    private String keahlian;
    private String ciriKhas;
    private String namaAyah;
    private String profesiAyah;
    private String namaIbu;
    private String profesiIbu;
    private int umurAsli;

    public ConanEdogawa(String nama, String profesi, String status, String peran, int umur, String jenisKelamin){
        super(nama,profesi,status,peran,umur,jenisKelamin);
    }

    public String getNamaAsli(){
        return namaAsli;
    }

    public void setNamaAsli(String namaAsli){
        this.namaAsli = namaAsli;
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

    public String getCiriKhas(){
        return ciriKhas;
    }

    public void setCiriKhas(String ciriKhas){
        this.ciriKhas = ciriKhas;
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

    public int getUmurAsli(){
        return umurAsli;
    }

    public void setUmurAsli(int umurAsli){
        this.umurAsli = umurAsli;
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
        System.out.println("Ciri khas\t\t: " + getCiriKhas());
        System.out.println("Keterangan\t\t: " + keterangan);
    }
}
