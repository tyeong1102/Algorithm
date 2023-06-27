/*
	시간 제한이 엄격한 경우 m > 200000일 경우 예외처리를 해줘야한다.
*/

#include <bits/stdc++.h>
using namespace std;

int n, m, cnt;
int arr[15001];

int main(){
    ios_base::sync_with_stdio(false);
	cin.tie(NULL);
    cout.tie(NULL);

	cin >> n >> m;

	for(int i = 0; i < n; i++){
		cin >> arr[i];
	}

	for(int i = 0; i < n; i++){
		for(int j = i + 1; j < n; j++){
			if(arr[i] + arr[j] == m) cnt++;
		}
	}

	cout << cnt << '\n';

    return 0;
}