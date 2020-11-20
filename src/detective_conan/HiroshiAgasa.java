package detective_conan;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class HiroshiAgasa extends DetectiveConan {
    private String kendaraan;
    private String keahlian;

    public HiroshiAgasa(String nama, String profesi, String status, String peran, int umur, String jenisKelamin){
        super(nama,profesi,status,peran,umur,jenisKelamin);
    }

    public String getKeahlian(){
        return keahlian;
    }

    public void setKeahlian(String keahlian){
        this.keahlian = keahlian;
    }

    public String getKendaraan(){
        return kendaraan;
    }

    public void setKendaraan(String kendaraan){
        this.kendaraan = kendaraan;
    }

    @Override
    public void tampilKeterangan(String keterangan){
        System.out.println("Keahlian\t\t: " + getKeahlian());
        System.out.println("Kendaraan\t\t: " + getKendaraan());
        System.out.println("Keterangan\t\t: " + keterangan);
    }
}
