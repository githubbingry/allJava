package Soal_Pemro_Comp.soal8.soal8_2;

public class testStock {
    public static void main(String[] args) {
        Stock s = new Stock("ORCL", "Oracle Corporation");
        s.previousClosingPrice = 34.5;
        s.currentPrice = 34.35;
        System.out.println(s.getChangePercent()); // idk, i look it up on google
        System.out.println(s.getChangePercent2()); // form current price side
        System.out.println(s.getChangePercent3()); // from previous price side
        System.out.println((s.getChangePercent2() + s.getChangePercent3())/2);

        int i = 7;
        test(s, i);
        System.out.println(s.currentPrice);
        System.out.println(i);
    }

    static void test(Stock s, int i){
        System.out.println(s.currentPrice);
        s.currentPrice = 10;
        System.out.println(i);
        i = 100;
    }
}
