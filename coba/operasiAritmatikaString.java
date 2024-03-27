package coba;

public class operasiAritmatikaString {
    public static void main(String[] args) {
        String s1 = "1", s2 = "2";
        int a = Integer.parseInt(s1) + Integer.parseInt(s2);
        System.out.println(a);
    }

    static int add(String s1, String s2){
        return Integer.parseInt(s1) + Integer.parseInt(s2);
    }
}
