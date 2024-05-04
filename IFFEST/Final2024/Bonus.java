package IFFEST.Final2024;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        x.close();
        // System.out.print(2+" ");
        // for(int i = 3; i <= n; i+=2){
        //     if(isPrime(i)) System.out.print(i + " ");
        // }
        ArrayList<Integer> p = findPrime(n);
        for(int pp : p) {
            System.out.print(pp+" ");
        }
    }

    static boolean isPrime(int a){
        if (a < 2) return false;
        for(int i = 2; i <= Math.sqrt(a); i++){
            if (a % i == 0) return false;
        }
        return true;
    }

    static ArrayList<Integer> findPrime(int n){
        boolean[] b = new boolean[n+1];
        Arrays.fill(b, true);
        ArrayList<Integer> pr = new ArrayList<>();
        for (int p = 2; ; p++) {
            int sum = p + p;
            if (sum > n) {
                break;
            }
    
            for (int i = sum; i <= n; i += p) {
                b[i] = false;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (b[i]) {
                pr.add(i);
            }
        }
        return pr;
    }
}
/*
int main() {
    int N;
    cin >> N;

    vector<int> primes = findPrimes(N);

    for (int prime : primes) {
        cout << prime << " ";
    }

    return 0;
}

vector<int> findPrimes(int N) {
    vector<bool> isPrime(static_cast<int64_t>(N) + 1, true);
    vector<int> primes;

    for (int p = 2; ; p++) {
        int sum = p + p;
        if (sum > N) {
            break;
        }

        for (int i = sum; i <= N; i += p) {
            isPrime[i] = false;
        }
    }

    for (int i = 2; i <= N; i++) {
        if (isPrime[i]) {
            primes.push_back(i);
        }
    }

    return primes;
}
 */
