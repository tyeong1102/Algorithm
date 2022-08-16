#include <iostream>
#include <algorithm>
using namespace std;

/*
만약 빨간색을 칠하면 다음 집에서는 초록색과 파란색만 사용할 수 있기 때문에 전 배열의 최소값을 비교한 후 
현재의 배열의 색을 더해주는 방법을 사용하였다.
*/

int a[1001][3]; // 가격 배열
int d[1001][3]; // 색 배열

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int n;
    cin >> n;

    for(int i=1; i<=n; i++){
        for(int j=0; j<3; j++){
            cin >> a[i][j];
        }
    }

    for(int i=1; i<=n; i++){
        d[i][0] = min(d[i-1][1], d[i-1][2]) + a[i][0]; // 빨강색
        d[i][1] = min(d[i-1][0], d[i-1][2]) + a[i][1]; // 초록색
        d[i][2] = min(d[i-1][0], d[i-1][1]) + a[i][2]; // 파란색
    }

    cout << min({d[n][0], d[n][1], d[n][2]}) << '\n'; // 각 방법의 최소값을 구함
}