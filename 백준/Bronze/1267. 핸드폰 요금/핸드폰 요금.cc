#include <bits/stdc++.h>
using namespace std;

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int n, sum = 0, time, ysik = 0, msik = 0;
  cin >> n;

  for (int i = 0; i < n; i++) {
    cin >> time;

    ysik += (time / 30 + 1) * 10;
    msik += (time / 60 + 1) * 15;
  }

  if (ysik > msik) {
    cout << "M " << msik << '\n';
  } else if (ysik < msik) {
    cout << "Y " << ysik << '\n';
  } else {
    cout << "Y M " << ysik << '\n';
  }
}