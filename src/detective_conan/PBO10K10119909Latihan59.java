package detective_conan;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class PBO10K10119909Latihan59 {

    public static void main(String[] args) {
        //Judul
        System.out.println("KARAKTER-KARAKTER DETECTIVE CONAN");
        System.out.println("Penulis : Gosho Aoyama");
        System.out.println("Since 1994");
        System.out.println();


        //Conan Edogawa
        ConanEdogawa ce = new ConanEdogawa("Conan Edogawa","Detektif Cilik, Siswa SMA yang menyamar jadi siswa SD","Lajang","Protagonis",7,"Laki-laki");
        ce.setNamaAsli("Shinichi Kudo");
        ce.setUmurAsli(17);
        ce.setNamaAyah("Yusaku Kudo");
        ce.setProfesiAyah("Penulis novel misteri terkenal (terutama novel detektif)");
        ce.setNamaIbu("Yukiko Kudo");
        ce.setProfesiIbu("Ibu rumah tangga, mantan aktris");
        ce.setKarakter("Imut dan lucu(saat menjadi kecil)");
        ce.setCiriKhas("Sering mengucapkan 'Ah-re-re?!'(Lho?!)");
        ce.tampilAtributSuper();
        ce.tampilKeterangan("Tubuhnya berubah menjadi kecil karena dipaksa meminum racun\n" +
                "\t\t\t\t  yang diberikan oleh Gin dan Vodka setelah terpergok saat\n" +
                "\t\t\t\t  menginvestigasi Gin dan Vodka");
        System.out.println();

        //Ai Haibara
        AiHaibara ah = new AiHaibara("Ai Haibara","Detektif, mantan anggota Organisasi Hitam", "Lajang", "Protagonis", 7, "Perempuan");
        ah.setNamaAsli("Shiho Miyano");
        ah.setUmurAsli(18);
        ah.setNamaAyah("Atsushi Miyano (meninggal)");
        ah.setProfesiAyah("Ahli Biokimia, anggota Organisasi Hitam");
        ah.setNamaIbu("Elena Miyano (meninggal)");
        ah.setProfesiIbu("Ahli Biokimia, anggota Organisasi Hitam");
        ah.setKarakter("Sering sinis");
        ah.tampilAtributSuper();
        ah.tampilKeterangan("Dialah yang membuat obat APTX 4869 (yang mengecilkan tubuh Shinichi), tetapi dia\n" +
                "\t\t\t\t  akhirnya juga ikut mengecil berkat obat tersebut.");
        System.out.println();

        //Ayumi Yoshida
        AyumiYoshida ay = new AyumiYoshida("Ayumi Yoshida", "Siswa SD Teitan, Detektif", "Lajang (menyukai Conan)", "Protagonis", 7, "Perempuan");
        ay.setKarakter("Baik hati, mudah tersenyum, dan menggunakan kata yang membuat suasana tenang");
        ay.tampilAtributSuper();
        ay.tampilKeterangan("Anggota Detektif Cilik perempuan pertama");
        System.out.println();

        //Eri Kisaki
        EriKisaki ek = new EriKisaki("Eri Kisaki", "Pengacara", "Menikah (berpisah)", "Tritagonis", 38, "Perempuan");
        ek.setNamaAnak("Ran Mouri");
        ek.setNamaSuami("Kogoro Mouri");
        ek.setProfesiSuami("Detektif swasta");
        ek.setHewanPeliharaan("Kucing jenis Russian Blue bernama Goro");
        ek.tampilAtributSuper();
        ek.tampilKeterangan("Dikenal sebagai 'Ratu Pengacara'. Meskipun hidup terpisah, tetapi di dalam\n" +
                "\t\t\t\t  diperlihatkan bahwa Eri sepertinya masih menggunakan cincin kawinnya.\n" +
                "\t\t\t\t  Dia juga masih mencintai suaminya walaupun benci dengan kebiasaan buruk\n" +
                "\t\t\t\t  suaminya.");
        System.out.println();

        //Genta Kojima
        GentaKojima gk = new GentaKojima("Genta Kojima", "Siswa SD Teitan, Detektif", "Lajang", "Protagonis", 7, "Laki-laki");
        gk.setNamaAyah("Genji Kojima");
        gk.setKarakter("Gemuk, besar, dan jago makan.");
        gk.setHobi("Makan, terutama Nasi Belut Bakar");
        gk.tampilAtributSuper();
        gk.tampilKeterangan("Awalnya dia adalah penindas, tetapi berubah menjadi baik kemudian.");
        System.out.println();

        //Heiji Hattori
        HeijiHattori hh = new HeijiHattori("Heiji Hattori", "Siswa SMA, Praktisi Kendo, dan Detektif", "Lajang (Teman Tapi Mesra (TTM) Kazuha Toyama)", "Protagonis", 17, "Laki-laki");
        hh.setHobi("Ellery Queen");
        hh.setKeahlian("Kendo, keterampilan detektif, kemampuan mengingat, dan atletik");
        hh.setCiriKhas("Berkuliat gelap");
        hh.tampilAtributSuper();
        hh.tampilKeterangan("Sering membantu Conan dalam menyembunyikan identitas aslinya.\n" +
                "\t\t\t\t  Walaupun berteman dekat dengan Conan, tetapi kompetitif dalam\n" +
                "\t\t\t\t  menyelidiki kasus dan sering menganggap jika Conan(Shinichi)\n" +
                "\t\t\t\t  adalah rivalnya.");
        System.out.println();

        //Hiroshi Agasa
        HiroshiAgasa ha = new HiroshiAgasa("Hiroshi Agasa", "Profesor", "Lajang", "Protagonis", 53, "Laki-laki");
        ha.setKeahlian("Ahli dalam membuat perangkat-perangkat");
        ha.setKendaraan("VW Beetle");
        ha.tampilAtributSuper();
        ha.tampilKeterangan("Sering membantu Detektif Cilik untuk membuat alat-alat unik dan hebat dan sering\n" +
                "\t\t\t\t  membawa mereka dengan mobilnya. Hiroshi menemukan Shiho Miyano di jalan\n" +
                "\t\t\t\t  lalu mengadopsinya dan memberinya nama samaran 'Ai Haibara'.");
        System.out.println();

        //Kazuha Toyama
        KazuhaToyama kt = new KazuhaToyama("Kazuha Toyama","Murid Akademi Kaihou, Praktisi Aikido","Lajang (Teman Tapi Mesra(TTM) Heiji Hattori)","Protagonis",17,"Perempuan");
        kt.setNamaAyah("Ginshiro Toyama");
        kt.setProfesiAyah("Komisaris Kepolisian Osaka");
        kt.setKarakter("Takut pada hantu, tidak pernah menyatakan perasaan sukanya,\n" +
                "\t\t\t\t  dan percaya pada takhayul dan jimat");
        kt.setKeahlian("Aikido");
        kt.tampilAtributSuper();
        kt.tampilKeterangan("Awalnya muncul disebabkan oleh kecemburuannya pada Conan,\n" +
                "\t\t\t\t  yang dia kira adalah seorang perempuan yang mendekati\n" +
                "\t\t\t\t  Heiji Hattori");
        System.out.println();

        //Kogoro Mouri
        KogoroMouri km = new KogoroMouri("Kogoro Mouri", "Detektif swasta", "Menikah (berpisah)", "Tritagonis", 38, "Laki-laki");
        km.setNamaAnak("Ran Mouri");
        km.setNamaIstri("Eri Kisaki");
        km.setProfesiIstri("Pengacara");
        km.setKarakter("Bermalas-malasan, jorok, sering membuat komentar sarkastik, dan pecandu alkohol\n" +
                "\t\t\t\t  & rokok.");
        km.setHobi("Fans dengan idol Yoko Okino, bertaruh pada pacuan kuda, bermain Mahjong, dan bermain\n" +
                "\t\t\t\t  & menonton Bisbol.");
        km.setKeahlian("Ahli Judo dan hebat dalam menembak dengan pistol.");
        km.setCiriKhas("Tergila-gila dengan wanita cantik dan sering tertidur saat sedang memecahkan kasus");
        km.tampilAtributSuper();
        km.tampilKeterangan("Dia sering tertidur karena dibius oleh Conan dan kemudian Conan menggunakan\n" +
                "\t\t\t\t  alat pengubah suara untuk meniru suara Kogoro.");
        System.out.println();

        //Mitsuhiko Tsuburaya
        MitsuhikoTsuburaya mt = new MitsuhikoTsuburaya("Mitsuhiko Tsuburaya", "Siswa SD Teitan, Detectif", "Lajang", "Protagonis", 7, "Laki-laki");
        mt.setKarakter("pintar dan pengetahuannya melebihi anak seumurannya");
        mt.setHobi("Menyukai teknologi");
        mt.tampilAtributSuper();
        mt.tampilKeterangan("Dia sering cemburu pada kedekatan Ai dan Conan");
        System.out.println();

        //Ran Mouri
        RanMouri rm = new RanMouri("Ran Mouri", "Siswa SMA Teitan", "Lajang (menyukai Shinichi Kudo)","Protagonis",17,"Perempuan");
        rm.setNamaAyah("Kogoro Mouri");
        rm.setProfesiAyah("Detektif swasta");
        rm.setNamaIbu("Eri Kisaki");
        rm.setProfesiIbu("Pengacara");
        rm.setTujuan("Ingin menyatukan Ayah dan Ibunya lagi yang telah berpisah sejak dia berumur\n" +
                "\t\t\t\t  7 tahun.");
        rm.setKarakter("Berani, mandiri, bertanggung jawab, mudah menangis, dan takut terhadap Hantu");
        rm.setKeahlian("Memiliki keberuntungan delam berbagai hal, terampil dalam Karate, dan hebat\n" +
                "\t\t\t\t  dalam mengurus rumah tangga");
        rm.tampilAtributSuper();
        rm.tampilKeterangan("Dia berteman sejak kecil dengan Shinichi (Conan) dan dia menyukai Shinichi\n" +
                "\t\t\t\t  sejak lama. Saat Shinichi menjadi Conan dia tinggal di rumah Ran\n" +
                "\t\t\t\t  untuk membantu ayah Ran, Kogoro dalam menyelidiki kasus.");
        System.out.println();

        //Sonoki Suzuki
        SonokiSuzuki ss = new SonokiSuzuki("Sonoki Suzuki", "Siswa SMA Teitan", "Kekasih Makoto Kyogoku", "Protagonis", 17, "Perempuan");
        ss.setNamaAyah("Shiro Suzuki");
        ss.setNamaIbu("Tomoko Suzuki");
        ss.setProfesiAyah("Pemilik perusahaan besar");
        ss.setProfesiIbu("Ibu rumah tangga");
        ss.setKarakter("- Keluarga kaya dan status sosial tinggi\n" +
                "\t\t\t\t  - Centil\n" +
                "\t\t\t\t  - Suka mencari perhatian remaja laki-laki\n" +
                "\t\t\t\t  - Agresif");
        ss.tampilAtributSuper();
        ss.tampilKeterangan("Bersahabat dekat dengan Ran Mouri. Sonoki sering disetrum oleh\n" +
                "\t\t\t\t  Conan dengan Jam Senjata Setrum agar Sonoki tertidur. Conan\n" +
                "\t\t\t\t  lalu berpura-pura menjadi Sonoko untuk menangkap penjahat.");

        System.out.println();
    }
}
