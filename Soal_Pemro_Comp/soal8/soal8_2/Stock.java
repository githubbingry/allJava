package Soal_Pemro_Comp.soal8.soal8_2;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String newSymbol, String newName){
        symbol = newSymbol;
        name = newName;
    }

    public double getChangePercent(){
        return Math.abs(currentPrice - previousClosingPrice)/(currentPrice+previousClosingPrice)*2*100;
    }

    public double getChangePercent2(){
        return Math.abs(currentPrice - previousClosingPrice)/currentPrice*100;
    }
    
    public double getChangePercent3(){
        return Math.abs(currentPrice - previousClosingPrice)/previousClosingPrice*100;
    }
}
