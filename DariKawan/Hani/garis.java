package DariKawan.Hani;

public class garis {
    private poin Awal;
    private poin Akhir;

    public garis (){
        this. Awal= new poin(0,0);
        this. Akhir= new poin(0,1);
    }
    public garis (int x1, int y1, int x2, int y2){
        if (x1==x2 && y1==y2){
            this.Awal= new poin (0,0);
            this.Akhir= new poin (0,1);
        } else{
            this.Awal = new poin(x1,y1);
            this.Akhir = new poin (x2,y2);
        }
    }
    public poin getAwal(){
        return this.Awal;
    }
    public void setAwal(int x, int y){
        if (x==this.Akhir.getX() && y==this.Akhir.getY()){
            System.out.println("Titik awal dan akhir tak sama");
        }else{
            this.Awal.setX(x);
            this.Akhir.setY(y);
        }
    }
    public poin getAkhir(){
        return this.Akhir;
    }
    public void setAkhir(int x,int y){
        if (x==this.Awal.getX() && y==this.Awal.getY()){
            System.out.println("titik awal dan akhir tak sama");
        } else{
            this.Awal.setX(x);
            this.Akhir.setY(y);
        }
    }
    @Override
    public String toString() {
        return "Garis dari (" + this.Awal.getX() + ", " + this.Awal.getY() + ") ke (" + this.Akhir.getX() + ", " + this.Akhir.getY()+")";
    }
}