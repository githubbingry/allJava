package coba;

public class loop {
    public static void main(String[] args) {
        //looping infinite jika didalam if
        // int i = 1;
        // while (i < 10)
        // if (i % 2 == 0)
        // System.out.println(i++);

        // int i = 1;
        // while (i < 10)
        // if ((i++) % 2 == 0)
        // System.out.println(i);

        // for (int i = 1; i < 5; i++) {
        // int j = 0;
        // while (j < i) {
        // System.out.print(j + " ");
        // j++;
        // }
        // System.out.println();
        // }

        // int i = 0;
        // while (i < 5) {
        // for (int j = i; j > 1; j--)
        // System.out.print(j + " ");
        // System.out.println();
        // System.out.println("****");
        // i++;
        //}

        //4.20 bagian c
        //deklarasi variabel i sebagai integer dengan nilai 5
        int i = 5;
        //while loop dengan kondisi i >= 1, jika true maka akan menjalankan statement didalam loop, jika false tidak akan melakukan apa apa.
        while (i >= 1) {
            //deklarasi variabel num sebagai integer dengan nilai 1
            int num = 1;
            //nested loop (for loop didalam while loop) dengan inisialisasi integer j dari 1 sampai kondisi j <= i, lalu increment j untuk membatasi iterasi for loop
            for (int j = 1; j <= i; j++) {
                //display variabel num(dari angka 1) ditambah string "xxx" tanpa spasi
                System.out.print(num + "xxx");
                //mengalikan variabel num dengan 2
                num *= 2;
            //mengulangi for loop sampai kondisi bernilai false yaitu 6(var. j)<=5(var. i)
            }
            //menambahkan new line setelah for loop
            System.out.println();
            //decrement i untuk membatasi iterasi while loop
            i--;
        //mengulangi while loop sampai kondisi bernilai false yaitu 0(var. i)>=1(sentinel value)
        }
        /*
        output :
        1xxx2xxx4xxx8xxx16xxx
        1xxx2xxx4xxx8xxx
        1xxx2xxx4xxx
        1xxx2xxx
        1xxx
        */
        
        System.out.println();
        
        //4.20 bagian d
        //deklarasi variabel i sebagai integer dengan nilai 1
        /*(int)*/ i = 1;
        //do while loop, akan melakukan dahulu 1 kali statement yang ada baru di cek kondisi while, jika true maka akan melakukan statement do lagi, jika false maka program akan berhenti
        do {
            //deklarasi variabel num sebagai integer dengan nilai 1
            int num = 1;
            //nested loop (for loop didalam while loop) dengan inisialisasi integer j dari 1 sampai kondisi j <= i, lalu increment j untuk membatasi iterasi for loop
            for (int j = 1; j <= i; j++) {
                //display variabel num(dari angka 1) ditambah string "G" tanpa spasi
                System.out.print(num + "G");
                //menambahkan variabel num dengan 2
                num += 2;
            //mengulangi for loop sampai kondisi bernilai false yaitu 6(var. j)<=5(var. i)
            }
            //menambahkan new line setelah for loop
            System.out.println();
            //increment i untuk membatasi iterasi while loop
            i++;
        //mengulangi do while loop sampai kondisi bernilai false yaitu 6(var. i)>=5(sentinel value)
        } while (i <= 5);
        /*
        output :
        1G
        1G3G
        1G3G5G
        1G3G5G7G
        1G3G5G7G9G
        */
    }
}
