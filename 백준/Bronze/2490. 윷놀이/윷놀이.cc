#include <bits/stdc++.h>
using namespace std;

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int num, zero;
  int t = 3;

  while (t-- > 0) {
    num = 0;
    zero = 0;
    for (int i = 0; i < 4; i++) {
      cin >> num;

      if (num == 0) {
        zero++;
      }
    }

    if (zero == 4) {
      cout << "D" << '\n';
    } else if (zero == 3) {
      cout << "C" << '\n';
    } else if (zero == 2) {
      cout << "B" << '\n';
    } else if (zero == 1) {
      cout << "A" << '\n';
    } else {
      cout << "E" << '\n';
    }
  }
}