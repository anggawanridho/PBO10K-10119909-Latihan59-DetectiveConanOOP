package detective_conan;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class KazuhaToyama extends DetectiveConan {
    private String namaAyah;
    private String profesiAyah;
    private String karakter;
    private String keahlian;

    public KazuhaToyama (String nama, String profesi, String status, String peran, int umur, String jenisKelamin){
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
        System.out.println("Karakter\t\t: " + getKarakter());
        System.out.println("Keterangan\t\t: " + keterangan);
    }
}
