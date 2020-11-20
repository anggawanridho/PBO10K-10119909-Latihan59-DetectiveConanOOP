package detective_conan;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class KogoroMouri extends DetectiveConan {
    private String namaAnak;
    private String namaIstri;
    private String profesiIstri;
    private String karakter;
    private String hobi;
    private String keahlian;
    private String ciriKhas;

    public KogoroMouri(String nama, String profesi, String status, String peran, int umur, String jenisKelamin){
        super(nama,profesi,status,peran,umur,jenisKelamin);
    }

    public String getNamaAnak(){
        return namaAnak;
    }

    public void setNamaAnak(String namaAnak){
        this.namaAnak = namaAnak;
    }

    public String getNamaIstri(){
        return namaIstri;
    }

    public void setNamaIstri(String namaIstri){
        this.namaIstri = namaIstri;
    }

    public String getProfesiIstri(){
        return profesiIstri;
    }

    public void setProfesiIstri(String profesiIstri){
        this.profesiIstri = profesiIstri;
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

    @Override
    public void tampilKeterangan(String keterangan){
        System.out.println("Nama Anak\t\t: " + getNamaAnak());
        System.out.println("Nama Istri\t\t: " + getNamaIstri());
        System.out.println("Profesi Istri\t: " + getProfesiIstri());
        System.out.println("Karakter\t\t: " + getKarakter());
        System.out.println("Hobi\t\t\t: " + getHobi());
        System.out.println("Keahlian\t\t: " + getKeahlian());
        System.out.println("Ciri khas\t\t: " + getCiriKhas());
        System.out.println("Keterangan\t\t: " + keterangan);
    }
}
