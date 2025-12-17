#include <bits/stdc++.h>
using namespace std;

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int arr[21], a, b;

  for (int i = 1; i <= 20; i++) {
    arr[i] = i;
  }

  for (int i = 0; i < 10; i++) {
    cin >> a >> b;

    reverse(arr + a, arr + b + 1);
  }

  for (int i = 1; i <= 20; i++) {
    cout << arr[i] << " ";
  }
}