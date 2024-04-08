package coba;

import java.util.ArrayList;
import java.util.List;

public class cobaList {
    public static void main(String[] args) {
        ArrayList<Integer> arL = new ArrayList<>();
        arL.add(10);
        
        for(int i = 0; i < arL.size(); i++){
            System.out.println(arL.get(i));
        }
    }
}
