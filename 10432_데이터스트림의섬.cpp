#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(nullptr);
	cout.tie(nullptr);

    int p;
    cin >> p;

    while (p--) {
        int t;
		cin >> t;

        int arr[12];
        for (int i = 0; i < 12; ++i) {
            cin >> arr[i];
        }

        int cnt = 0;
        for (int i = 1; i < 11; ++i) {
            int m = arr[i];
            for (int j = i; j < 11; ++j) {
                m = min(m, arr[j]);
                if (m > arr[i-1] && m > arr[j+1]) {
                    ++cnt;
                }
            }
        }

        cout << t << ' ' << cnt << '\n';
    }

    return 0;
}