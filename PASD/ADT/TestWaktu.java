package PASD.ADT;

public class TestWaktu {
    public static void main(String[] args) {
        Waktu hari_ini = new Waktu(11, 8, 30);
        System.out.printf("""
            jam : %d
            menit : %d
            detik : %d\n"""
            , hari_ini.getJam()
            , hari_ini.getMenit()
            , hari_ini.getDetik()
        );

        hari_ini.setJam(100000);
        hari_ini.setMenit(1234567);
        hari_ini.setDetik(-12342);
        System.out.printf("""
            jam : %d
            menit : %d
            detik : %d\n"""
            , hari_ini.getJam()
            , hari_ini.getMenit()
            , hari_ini.getDetik()
        );
    }
}
