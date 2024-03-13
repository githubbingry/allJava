package DariKawan.Daffarel;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String newsymboll,String newnames) {
        symbol = newsymboll;
        name = newnames;
    }

    public double getChangePercent(){
        return Math.abs(currentPrice - previousClosingPrice)/(currentPrice+previousClosingPrice)*2*100;
        // rumus adalah value1 - value2 dibagi value1 + value2 seperdua seperduanya naik sehingga dikali
    }

    public double getChangePercent2(){
        return Math.abs(currentPrice - previousClosingPrice)/currentPrice*100;
    }
    
    public double getChangePercent3(){
        return Math.abs(currentPrice - previousClosingPrice)/previousClosingPrice*100;
    }
}
    