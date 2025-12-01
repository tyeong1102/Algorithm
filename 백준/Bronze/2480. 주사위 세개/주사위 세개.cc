#include <bits/stdc++.h>
using namespace std;

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int a, b, c, res;
  cin >> a >> b >> c;

  if (a == b && a == c) {
    res = 10000 + (a * 1000);
  } else if ((a == b && b != c) || (a == c && a != b)) {
    res = 1000 + (a * 100);
  } else if (b == c && b != a) {
    res = 1000 + (b * 100);
  } else {
    int mx = max({a, b, c});
    res = mx * 100;
  }

  cout << res << '\n';
}