/*#include <iostream>
#include <vector>

using namespace std;

vector<int> findPrimes(int N);

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

//vers2

#include <iostream>
#include <vector>

using namespace std;

vector<int> findPrimes(int N);

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
    vector<bool> isPrime(N + 1, true);
    vector<int> primes;

    if (N >= 2) {
        primes.push_back(2);
    }
    if (N >= 0) {
        isPrime[0] = false;
    }

    if (N >= 1) {
        isPrime[1] = false;
    }

    for (int p = 2; p <= N; p++) {
        if (isPrime[p]) {
            for (int i = p * 2; i <= N; i += p) {
                isPrime[i] = false;
            }
        }
    }

    for (int i = 3; i <= N; i += 2) {
        if (isPrime[i]) {
            primes.push_back(i);
        }
    }

    return primes;
}*/

#include <iostream>
/*using namespace std;*/
#include <string>

int main() {
int x, y;
char a[100];
std:: string z;
std:: cin >> x;
std:: cin >> y;
getline(std::cin,z);
scanf("%s",a);
fgets(a,100,stdin);
std :: cout<< x << y << z << a;

}