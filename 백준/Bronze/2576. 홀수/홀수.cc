#include <bits/stdc++.h>
using namespace std;

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int num, sum = 0, min = 100;

  for (int i = 0; i < 7; i++) {
    cin >> num;

    if (num % 2 == 1) {
      sum += num;
      if (min > num) {
        min = num;
      }
    }
  }

  if (sum == 0) {
    cout << -1 << '\n';
  } else {
    cout << sum << '\n' << min;
  }
}