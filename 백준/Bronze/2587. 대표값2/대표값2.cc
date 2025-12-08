#include <bits/stdc++.h>
using namespace std;

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int arr[5], sum = 0, avg, mid;

  for (int i = 0; i < 5; i++) {
    cin >> arr[i];
    sum += arr[i];
  }

  sort(arr, arr + 5);

  avg = sum / 5;
  mid = arr[2];

  cout << avg << '\n' << mid << '\n';
}