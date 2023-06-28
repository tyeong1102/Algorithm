#include <bits/stdc++.h>
using namespace std;

int n;

int main(){
    ios_base::sync_with_stdio(false);
	cin.tie(NULL);
    cout.tie(NULL);

	while(cin >> n){
		int pos = 1;
		int ret = 1;

		while(true){
			if(pos % n == 0){
				cout << ret << '\n';
				break;
			} else{
				pos = pos * 10 + 1;
				pos %= n;
				ret++;
			}
		}
	}

    return 0;
}