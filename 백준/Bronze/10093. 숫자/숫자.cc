#include <bits/stdc++.h>
using namespace std;

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  long long a, b, s, e, cnt;
  cin >> a >> b;

  if (a == b) {
    cout << 0 << '\n';
    return 0;
  }

  s = min(a, b);
  e = max(a, b);

  cnt = e - s - 1;
  cout << cnt << '\n';

  for (long long i = s + 1; i < e; i++) {
    cout << i << " ";
  }
}