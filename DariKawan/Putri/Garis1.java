package DariKawan.Putri;

public class Garis1 {
    private Poinn Awal;
    private Poinn Akhir;

    // Konstruktor dengan titik awal dan titik akhir default
    public Garis1() {
        this.Awal = new Poinn(0, 0);
        this.Akhir = new Poinn(0, 1);
    }

    // Konstruktor dengan koordinat titik awal dan titik akhir
    public Garis1(int x1, int y1, int x2, int y2) {
        // Pengkondisian untuk memastikan koordinat valid
        if (x1 == x2 && y1 == y2) {
            this.Awal = new Poinn(0, 0);
            this.Akhir = new Poinn(0, 1);
        } else {
            this.Awal = new Poinn(x1, y1);
            this.Akhir = new Poinn(x2, y2);
        }
    }

    // Setter untuk titik awal dengan pengkondisian
    public void setAwal(int x, int y) {
        if (x == this.Akhir.getX() && y == this.Akhir.getY()) {
            System.out.println("Titik awal dan akhir tidak boleh sama!");
        } else {
            this.Awal.setX(x);
            this.Awal.setY(y);
        }
    }

    // Setter untuk titik akhir dengan pengkondisian
    public void setAkhir(int x, int y) {
        if (x == this.Awal.getX() && y == this.Awal.getY()) {
            System.out.println("Titik awal dan akhir tidak boleh sama!");
        } else {
            this.Akhir.setX(x);
            this.Akhir.setY(y);
        }
    }

    // Method untuk menampilkan informasi garis
    @Override
    public String toString() {
        return "Garis dari (" + this.Awal.getX() + ", " + this.Awal.getY() + ") ke (" + this.Akhir.getX() + ", " + this.Akhir.getY() + ")";
    }

    public static void main(String[] args) {
        Garis1 g = new Garis1(5,5, 5,5);
        System.out.println(g.toString());
        g.setAkhir(2, 4);
        System.out.println(g.toString());

        Garis1 g2 = new Garis1(0, 0, 0, 2);
        System.out.println(g2.toString());
        g2.setAwal(0, 2);
        System.out.println(g2.toString());
    }
}
