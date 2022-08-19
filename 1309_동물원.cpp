#include <iostream>
using namespace std;

/*
1줄 1줄 추가해간다고 생각했을 때 n번째 줄이 추가되어 비어있다고하면, n-1번째까지의 칸을 채우는 방법과 같다고 볼 수 있다.
*/

int d[100001][3];

int main(){
    int n;
    cin >> n;

    d[0][0] = 1;
    for(int i=1; i<=n; i++){
        d[i][0] = d[i-1][0] + d[i-1][1] + d[i-1][2];
        d[i][1] = d[i-1][0] + d[i-1][2];
        d[i][2] = d[i-1][0] + d[i-1][1];
        for(int j=0; j<3; j++){
            d[i][j] %= 9901;
        }
    }
    cout << (d[n][0] + d[n][1] + d[n][2]) % 9901 << '\n';
}