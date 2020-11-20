package detective_conan;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class EriKisaki extends DetectiveConan {
    private String namaAnak;
    private String namaSuami;
    private String profesiSuami;
    private String hewanPeliharaan;

    public EriKisaki(String nama, String profesi, String status, String peran, int umur, String jenisKelamin){
        super(nama,profesi,status,peran,umur,jenisKelamin);
    }

    public String getNamaAnak(){
        return namaAnak;
    }

    public void setNamaAnak(String namaAnak){
        this.namaAnak = namaAnak;
    }

    public String getNamaSuami(){
        return namaSuami;
    }

    public void setNamaSuami(String namaSuami){
        this.namaSuami = namaSuami;
    }

    public String getProfesiSuami(){
        return profesiSuami;
    }

    public void setProfesiSuami(String profesiSuami){
        this.profesiSuami = profesiSuami;
    }

    public String getHewanPeliharaan(){
        return hewanPeliharaan;
    }

    public void setHewanPeliharaan(String hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }

    @Override
    public void tampilKeterangan(String keterangan){
        System.out.println("Nama Anak\t\t: " + getNamaAnak());
        System.out.println("Nama Suami\t\t: " + getNamaSuami());
        System.out.println("Profesi Suami\t: " + getProfesiSuami());
        System.out.println("Hewan peliharaan: " + getHewanPeliharaan());
        System.out.println("Keterangan\t\t: " + keterangan);
    }
}
