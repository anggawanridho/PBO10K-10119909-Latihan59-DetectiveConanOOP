package detective_conan;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class HeijiHattori extends DetectiveConan {
    private String keahlian;
    private String ciriKhas;
    private String kendaraan;
    private String hobi;

    public HeijiHattori(String nama, String profesi, String status, String peran, int umur, String jenisKelamin){
        super(nama,profesi,status,peran,umur,jenisKelamin);
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

    public String getKendaraan(){
        return kendaraan;
    }

    public void setKendaraan(String kendaraan){
        this.kendaraan = kendaraan;
    }

    public String getHobi(){
        return hobi;
    }

    public void setHobi(String hobi){
        this.hobi = hobi;
    }

    @Override
    public void tampilKeterangan(String keterangan){
        System.out.println("Penulis favorit\t: " + getHobi());
        System.out.println("Keahlian\t\t: " + getKeahlian());
        System.out.println("Ciri khas\t\t: " + getCiriKhas());
        System.out.println("Keterangan\t\t: " + keterangan);
    }
}
