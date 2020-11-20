package detective_conan;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class GentaKojima extends DetectiveConan {
    private String karakter;
    private String hobi;
    private String namaAyah;

    public GentaKojima(String nama, String profesi, String status, String peran, int umur, String jenisKelamin){
        super(nama,profesi,status,peran,umur,jenisKelamin);
    }

    public String getNamaAyah(){
        return namaAyah;
    }

    public void setNamaAyah(String namaAyah){
        this.namaAyah = namaAyah;
    }

    public String getKarakter(){
        return karakter;
    }

    public void setKarakter(String karakter){
        this.karakter = karakter;
    }

    public String getHobi(){
        return hobi;
    }

    public void setHobi(String hobi){
        this.hobi = hobi;
    }

    @Override
    public void tampilKeterangan(String keterangan){
        System.out.println("Nama Ayah\t\t: " + getNamaAyah());
        System.out.println("Karakter\t\t: " + getKarakter());
        System.out.println("Hobi\t\t\t: " + getHobi());
        System.out.println("Keterangan\t\t: " + keterangan);
    }
}
