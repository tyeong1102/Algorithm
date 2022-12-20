#include <iostream>
#include <algorithm>
using namespace std;

int d[100001][3]; // 뜯지않음, 위쪽 , 아래쪽
int arr[100001][2]; // 위, 아래 값

int main(){
    int t, n;
    cin >> t;

    while(t--){
        cin >> n;

        for(int i=1; i<=n; i++){
            cin >> arr[i][0]; // 1번째 줄 값
        }

        for(int i=1; i<=n; i++){
            cin >> arr[i][1]; // 2번째 줄 값
        }

        d[0][0] = d[0][1] = d[0][2] = 0;

        for(int i=1; i<=n; i++){
            d[i][0] = max({d[i-1][0], d[i-1][1], d[i-1][2]}); // 아무것도 안뜯음
            d[i][1] = max(d[i-1][0], d[i-1][2]) + arr[i][0]; // 위쪽 뜯음
            d[i][2] = max(d[i-1][0], d[i-1][1]) + arr[i][1]; // 아래쪽 뜯음
        }

        int res = max({d[n][0], d[n][1], d[n][2]});
        cout << res << '\n';
    }
}