package detective_conan;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class AyumiYoshida extends DetectiveConan {
    private String karakter;

    public AyumiYoshida(String nama, String profesi, String status, String peran, int umur, String jenisKelamin){
        super(nama,profesi,status,peran,umur,jenisKelamin);
    }

    public String getKarakter(){
        return karakter;
    }

    public void setKarakter(String karakter){
        this.karakter = karakter;
    }

    @Override
    public void tampilKeterangan(String keterangan){
        System.out.println("Karakter\t\t: " + getKarakter());
        System.out.println("Keterangan\t\t: " + keterangan);
    }
}
