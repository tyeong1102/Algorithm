#include <iostream>
using namespace std;
int main() {
    int t;
    int a[7];
    cin >> t;

    while (t--) {
        int sum = 0;
        int min = 101;

        for (int i = 0; i < 7; i++){
            cin >> a[i];
            if (a[i] % 2 == 0){
                sum += a[i];
                if (a[i] < min)
                    min = a[i];
            }
        }
        cout << sum << ' ' << min <<'\n';
    }
    return 0;
}