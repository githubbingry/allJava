package DariKawan.Hani;

public class poin {
    private int x;
    private int y;

    public poin (int x, int y){
        this.x=x;
        this.y=y;
    }
    public poin (){
        this.x=0;
        this.y=0;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    @Override
    public String toString(){
        return "("+this.x+", "+this.y+")";
}

}
