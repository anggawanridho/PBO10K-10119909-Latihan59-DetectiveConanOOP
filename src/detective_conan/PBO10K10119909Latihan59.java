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
        ConanEdogawa conan = new ConanEdogawa("Conan Edogawa","Detektif Cilik, Siswa SMA yang menyamar jadi siswa SD","Lajang","Protagonis",7,"Laki-laki");
        conan.setNamaAsli("Shinichi Kudo");
        conan.setUmurAsli(17);
        conan.setNamaAyah("Yusaku Kudo");
        conan.setProfesiAyah("Penulis novel misteri terkenal (terutama novel detektif)");
        conan.setNamaIbu("Yukiko Kudo");
        conan.setProfesiIbu("Ibu rumah tangga, mantan aktris");
        conan.setKarakter("Imut dan lucu(saat menjadi kecil)");
        conan.setCiriKhas("Sering mengucapkan 'Ah-re-re?!'(Lho?!)");
        conan.tampilAtributSuper();
        conan.tampilKeterangan("Tubuhnya berubah menjadi kecil karena dipaksa meminum racun\n" +
                "\t\t\t\t  yang diberikan oleh Gin dan Vodka setelah terpergok saat\n" +
                "\t\t\t\t  menginvestigasi Gin dan Vodka");
        System.out.println();

        //Ai Haibara
        AiHaibara haibara = new AiHaibara("Ai Haibara","Detektif, mantan anggota Organisasi Hitam", "Lajang", "Protagonis", 7, "Perempuan");
        haibara.setNamaAsli("Shiho Miyano");
        haibara.setUmurAsli(18);
        haibara.setNamaAyah("Atsushi Miyano (meninggal)");
        haibara.setProfesiAyah("Ahli Biokimia, anggota Organisasi Hitam");
        haibara.setNamaIbu("Elena Miyano (meninggal)");
        haibara.setProfesiIbu("Ahli Biokimia, anggota Organisasi Hitam");
        haibara.setKarakter("Sering sinis");
        haibara.tampilAtributSuper();
        haibara.tampilKeterangan("Dialah yang membuat obat APTX 4869 (yang mengecilkan tubuh Shinichi), tetapi dia\n" +
                "\t\t\t\t  akhirnya juga ikut mengecil berkat obat tersebut.");
        System.out.println();

        //Ayumi Yoshida
        AyumiYoshida ayumi = new AyumiYoshida("Ayumi Yoshida", "Siswa SD Teitan, Detektif", "Lajang (menyukai Conan)", "Protagonis", 7, "Perempuan");
        ayumi.setKarakter("Baik hati, mudah tersenyum, dan menggunakan kata yang membuat suasana tenang");
        ayumi.tampilAtributSuper();
        ayumi.tampilKeterangan("Anggota Detektif Cilik perempuan pertama");
        System.out.println();

        //Eri Kisaki
        EriKisaki eri = new EriKisaki("Eri Kisaki", "Pengacara", "Menikah (berpisah)", "Tritagonis", 38, "Perempuan");
        eri.setNamaAnak("Ran Mouri");
        eri.setNamaSuami("Kogoro Mouri");
        eri.setProfesiSuami("Detektif swasta");
        eri.setHewanPeliharaan("Kucing jenis Russian Blue bernama Goro");
        eri.tampilAtributSuper();
        eri.tampilKeterangan("Dikenal sebagai 'Ratu Pengacara'. Meskipun hidup terpisah, tetapi di dalam\n" +
                "\t\t\t\t  diperlihatkan bahwa Eri sepertinya masih menggunakan cincin kawinnya.\n" +
                "\t\t\t\t  Dia juga masih mencintai suaminya walaupun benci dengan kebiasaan buruk\n" +
                "\t\t\t\t  suaminya.");
        System.out.println();

        //Genta Kojima
        GentaKojima genta = new GentaKojima("Genta Kojima", "Siswa SD Teitan, Detektif", "Lajang", "Protagonis", 7, "Laki-laki");
        genta.setNamaAyah("Genji Kojima");
        genta.setKarakter("Gemuk, besar, dan jago makan.");
        genta.setHobi("Makan, terutama Nasi Belut Bakar");
        genta.tampilAtributSuper();
        genta.tampilKeterangan("Awalnya dia adalah penindas, tetapi berubah menjadi baik kemudian.");
        System.out.println();

        //Heiji Hattori
        HeijiHattori heiji = new HeijiHattori("Heiji Hattori", "Siswa SMA, Praktisi Kendo, dan Detektif", "Lajang (Teman Tapi Mesra (TTM) Kazuha Toyama)", "Protagonis", 17, "Laki-laki");
        heiji.setHobi("Ellery Queen");
        heiji.setKeahlian("Kendo, keterampilan detektif, kemampuan mengingat, dan atletik");
        heiji.setCiriKhas("Berkuliat gelap");
        heiji.tampilAtributSuper();
        heiji.tampilKeterangan("Sering membantu Conan dalam menyembunyikan identitas aslinya.\n" +
                "\t\t\t\t  Walaupun berteman dekat dengan Conan, tetapi kompetitif dalam\n" +
                "\t\t\t\t  menyelidiki kasus dan sering menganggap jika Conan(Shinichi)\n" +
                "\t\t\t\t  adalah rivalnya.");
        System.out.println();

        //Hiroshi Agasa
        HiroshiAgasa hiroshi = new HiroshiAgasa("Hiroshi Agasa", "Profesor", "Lajang", "Protagonis", 53, "Laki-laki");
        hiroshi.setKeahlian("Ahli dalam membuat perangkat-perangkat");
        hiroshi.setKendaraan("VW Beetle");
        hiroshi.tampilAtributSuper();
        hiroshi.tampilKeterangan("Sering membantu Detektif Cilik untuk membuat alat-alat unik dan hebat dan sering\n" +
                "\t\t\t\t  membawa mereka dengan mobilnya. Hiroshi menemukan Shiho Miyano di jalan\n" +
                "\t\t\t\t  lalu mengadopsinya dan memberinya nama samaran 'Ai Haibara'.");
        System.out.println();

        //Kazuha Toyama
        KazuhaToyama kazuha = new KazuhaToyama("Kazuha Toyama","Murid Akademi Kaihou, Praktisi Aikido","Lajang (Teman Tapi Mesra(TTM) Heiji Hattori)","Protagonis",17,"Perempuan");
        kazuha.setNamaAyah("Ginshiro Toyama");
        kazuha.setProfesiAyah("Komisaris Kepolisian Osaka");
        kazuha.setKarakter("Takut pada hantu, tidak pernah menyatakan perasaan sukanya,\n" +
                "\t\t\t\t  dan percaya pada takhayul dan jimat");
        kazuha.setKeahlian("Aikido");
        kazuha.tampilAtributSuper();
        kazuha.tampilKeterangan("Awalnya muncul disebabkan oleh kecemburuannya pada Conan,\n" +
                "\t\t\t\t  yang dia kira adalah seorang perempuan yang mendekati\n" +
                "\t\t\t\t  Heiji Hattori");
        System.out.println();

        //Kogoro Mouri
        KogoroMouri kogoro = new KogoroMouri("Kogoro Mouri", "Detektif swasta", "Menikah (berpisah)", "Tritagonis", 38, "Laki-laki");
        kogoro.setNamaAnak("Ran Mouri");
        kogoro.setNamaIstri("Eri Kisaki");
        kogoro.setProfesiIstri("Pengacara");
        kogoro.setKarakter("Bermalas-malasan, jorok, sering membuat komentar sarkastik, dan pecandu alkohol\n" +
                "\t\t\t\t  & rokok.");
        kogoro.setHobi("Fans dengan idol Yoko Okino, bertaruh pada pacuan kuda, bermain Mahjong, dan bermain\n" +
                "\t\t\t\t  & menonton Bisbol.");
        kogoro.setKeahlian("Ahli Judo dan hebat dalam menembak dengan pistol.");
        kogoro.setCiriKhas("Tergila-gila dengan wanita cantik dan sering tertidur saat sedang memecahkan kasus");
        kogoro.tampilAtributSuper();
        kogoro.tampilKeterangan("Dia sering tertidur karena dibius oleh Conan dan kemudian Conan menggunakan\n" +
                "\t\t\t\t  alat pengubah suara untuk meniru suara Kogoro.");
        System.out.println();

        //Mitsuhiko Tsuburaya
        MitsuhikoTsuburaya mitsuhiko = new MitsuhikoTsuburaya("Mitsuhiko Tsuburaya", "Siswa SD Teitan, Detectif", "Lajang", "Protagonis", 7, "Laki-laki");
        mitsuhiko.setKarakter("pintar dan pengetahuannya melebihi anak seumurannya");
        mitsuhiko.setHobi("Menyukai teknologi");
        mitsuhiko.tampilAtributSuper();
        mitsuhiko.tampilKeterangan("Dia sering cemburu pada kedekatan Ai dan Conan");
        System.out.println();

        //Ran Mouri
        RanMouri ran = new RanMouri("Ran Mouri", "Siswa SMA Teitan", "Lajang (menyukai Shinichi Kudo)","Protagonis",17,"Perempuan");
        ran.setNamaAyah("Kogoro Mouri");
        ran.setProfesiAyah("Detektif swasta");
        ran.setNamaIbu("Eri Kisaki");
        ran.setProfesiIbu("Pengacara");
        ran.setTujuan("Ingin menyatukan Ayah dan Ibunya lagi yang telah berpisah sejak dia berumur\n" +
                "\t\t\t\t  7 tahun.");
        ran.setKarakter("Berani, mandiri, bertanggung jawab, mudah menangis, dan takut terhadap Hantu");
        ran.setKeahlian("Memiliki keberuntungan delam berbagai hal, terampil dalam Karate, dan hebat\n" +
                "\t\t\t\t  dalam mengurus rumah tangga");
        ran.tampilAtributSuper();
        ran.tampilKeterangan("Dia berteman sejak kecil dengan Shinichi (Conan) dan dia menyukai Shinichi\n" +
                "\t\t\t\t  sejak lama. Saat Shinichi menjadi Conan dia tinggal di rumah Ran\n" +
                "\t\t\t\t  untuk membantu ayah Ran, Kogoro dalam menyelidiki kasus.");
        System.out.println();

        //Sonoki Suzuki
        SonokiSuzuki sonoki = new SonokiSuzuki("Sonoki Suzuki", "Siswa SMA Teitan", "Kekasih Makoto Kyogoku", "Protagonis", 17, "Perempuan");
        sonoki.setNamaAyah("Shiro Suzuki");
        sonoki.setNamaIbu("Tomoko Suzuki");
        sonoki.setProfesiAyah("Pemilik perusahaan besar");
        sonoki.setProfesiIbu("Ibu rumah tangga");
        sonoki.setKarakter("- Keluarga kaya dan status sosial tinggi\n" +
                "\t\t\t\t  - Centil\n" +
                "\t\t\t\t  - Suka mencari perhatian remaja laki-laki\n" +
                "\t\t\t\t  - Agresif");
        sonoki.tampilAtributSuper();
        sonoki.tampilKeterangan("Bersahabat dekat dengan Ran Mouri. Sonoki sering disetrum oleh\n" +
                "\t\t\t\t  Conan dengan Jam Senjata Setrum agar Sonoki tertidur. Conan\n" +
                "\t\t\t\t  lalu berpura-pura menjadi Sonoko untuk menangkap penjahat.");

        System.out.println();
    }
}
