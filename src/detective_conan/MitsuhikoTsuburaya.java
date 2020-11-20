package detective_conan;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class MitsuhikoTsuburaya extends DetectiveConan {
    private String hobi;
    private String karakter;

    public MitsuhikoTsuburaya(String nama, String profesi, String status, String peran, int umur, String jenisKelamin){
        super(nama,profesi,status,peran,umur,jenisKelamin);
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
        System.out.println("Karakter\t\t: " + getKarakter());
        System.out.println("Hobi\t\t\t: " + getHobi());
        System.out.println("Keterangan\t\t: " + keterangan);
    }
}
