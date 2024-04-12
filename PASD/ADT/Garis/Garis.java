package PASD.ADT.Garis;

public class Garis {
    private Point awal;
    private Point akhir;

    private boolean isValid(Point p1, Point p2){
        return (p1.getX() != p2.getX()) || (p1.getY() != p2.getY());
    }

    public Garis() {
        this.awal = new Point(0, 0);
        this.akhir = new Point(1, 1);
    }

    public Garis(Point awal, Point akhir) {
        if (isValid(awal, akhir)){
            this.awal = awal;
            this.akhir = akhir;
        } else {
            System.out.println("Pembuatan garis dengan point tidak valid");
            System.out.println("Kedua point memiliki nilai x dan y yang sama");
            System.out.println("Garis yang dibuat menjadi default dengan titik awal (0, 0) dan titik akhir (1, 1)");
            this.awal = new Point(0, 0);
            this.akhir = new Point(1, 1);
        }
    }

    public Point getAwal() {
        return this.awal;
    }

    public void setAwal(Point awal) {
        if (isValid(awal, this.akhir)){
            this.awal = awal;
        } else {
            System.out.println("Perubahan point inputan awal sama dengan point akhir, perubahan tidak valid dan gagal");
        }
    }

    public Point getAkhir() {
        return this.akhir;
    }

    public void setAkhir(Point akhir) {
        if (isValid(akhir, this.awal)){
            this.akhir = akhir;
        } else {
            System.out.println("Perubahan point inputan akhir sama dengan point awal, perubahan tidak valid dan gagal");
        }
    }
    
    @Override
    public String toString(){
        return String.format("""
            Titik Awal : %s
            Titik Akhir : %s""",
            this.awal.toString(),
            this.akhir.toString()
        );
    }

    //method length garis
    public double getPanjangGaris(){ // more readable
        int xDiff = this.awal.getX() - this.akhir.getX();
        int yDiff = this.awal.getY() - this.akhir.getY();
        int xDiffSquared = xDiff * xDiff;
        int yDiffSquared = yDiff * yDiff;
        double panjang = Math.sqrt(xDiffSquared + yDiffSquared);
        return panjang;
    }

    // public double getPanjangGaris(){
    //     return Math.sqrt(Math.pow(awal.getX() - akhir.getX(), 2) + Math.pow(awal.getY() - akhir.getY(), 2));
    // }

    //tambah method mencari slope/gradien
    public double getGradien(){
        int xDiff = this.akhir.getX() - this.awal.getX();
        int yDiff = this.akhir.getY() - this.awal.getY();
        return (double)yDiff/(double)xDiff;
    }

    //tambah method angle dari sumbu x positif
    public double getAngleRadian(){
        return Math.atan(this.getGradien());
    }

    public double getAngleDegree(){
        return this.getAngleRadian()*180/Math.PI;
    }

    //tambah method fungsi garis f(x) = mx + b untuk di point awal dan akhir
    /*
    y - y0 = m(x - x0)
    y = mx + (-mx0 + y0)
     */
    public String getFunction(){
        double m, b;
        String s = "";
        if(this.akhir.getX() == this.awal.getX()){ //untuk m = tak terdefinisi atau infinity
            s = "x = " + this.akhir.getX();
        } else if (this.akhir.getY() == this.awal.getY()){ // untuk m = 0
            s = "y = " + this.awal.getY();
        } else {
            m = this.getGradien();
            b = -m*this.awal.getX() + this.awal.getY();
            s = this.gradientFormat(m) + this.bFormat(b);
        }
        return s;
    }

    private String gradientFormat(double m){
        String s = "";
        int mInt;
        if(m % 1 == 0){
            mInt = (int)m;
            if(mInt == 1){
                s = "y = x";
            } else {
                s = "y = "+mInt+"x";
            }
        } else {
            s = "y = "+m+"x";
        }
        return s;
    }

    private String bFormat(double b){
        // String s = "";
        // if (b < 0){
        //     s = " - "+ -b;
        // } else if (b > 0){
        //     s = " + "+ b;
        // }
        // return s;
        return b < 0
            ? " - " + -b
            : " + " + b
        ;
    }
    
    //tambah method luas area dibawah garis jika diatas sumbu x, diatas garis jika dibawah sumbu y
    /*
    bentuk dan letak garis terpisah menjadi 3
    1. menghimpit sumbu x atau y1 = y2 = 0.
    2. diatas sumbu x (mencari area di bawah garis):
        2a. garis horizontal dimana gradien = 0 atau y1=y2
        2b. garis miring dimana gradien != 0 :
            2b1. |y1| > |y2|
            2b2. |y1| < |y2|
        2c. garis vertikal dimana gradien = inf atau x1 = x2
    3. dibawah sumbu x (mencari area di atas garis):
        3a. garis horizontal dimana gradien = 0 atau y1=y2
        3b. garis miring dimana gradien != 0 :
            3b1. |y1| > |y2|
            3b2. |y1| < |y2|
        3c. garis vertikal dimana gradien = inf atau x1 = x2
    4. membelah sumbu x (mencari area segitiga di atas dan di bawah sumbu x).
     */
}
