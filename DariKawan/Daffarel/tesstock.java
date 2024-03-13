package DariKawan.Daffarel;

public class tesstock {
    public static void main(String[] args) {
        Stock s = new Stock("ORCL", "Oracle Corporation");
        s.previousClosingPrice = 34.5;
        s.currentPrice = 34.35;
        System.out.println(s.getChangePercent());
        System.out.println(s.getChangePercent2()); // form current price side
        System.out.println(s.getChangePercent3()); // from previous price side
        System.out.println((s.getChangePercent2() + s.getChangePercent3())/2);
    }
}


