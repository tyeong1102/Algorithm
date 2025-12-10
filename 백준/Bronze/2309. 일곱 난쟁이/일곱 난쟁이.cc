#include <bits/stdc++.h>
using namespace std;

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int arr[9], sum = 0, s, e;

  for (int i = 0; i < 9; i++) {
    cin >> arr[i];
    sum += arr[i];
  }

  sort(arr, arr + 9);

  for (int i = 0; i < 9; i++) {
    for (int j = i; j < 9; j++) {
      if (sum - arr[i] - arr[j] == 100) {
        for (int k = 0; k < 9; k++) {
          if (k == i || k == j) continue;
          cout << arr[k] << '\n';
        }
        return 0;
      }
    }
  }
}