#include <iostream>
using namespace std;

int d[501][501];
int arr[501][501];

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int n;
    cin >> n;

    for(int i=0; i<n; i++){
        for(int j=0; j<=i; j++){
            cin >> arr[i][j]; // 값 입력
        }
    }

    d[0][0] = arr[0][0];

    for(int i=1; i<n; i++){ // 첫번째 줄부터 입력
        for(int j=0; j<=i; j++){
            d[i][j] = d[i-1][j] + arr[i][j];
            if(j-1>=0 && d[i][j]<d[i-1][j-1] + arr[i][j]){
                // d[i][j]값이 전의 값에 새로운 수를 더한 것보다 작으면 전 수에 더한 값으로 값 설정
                d[i][j] = d[i-1][j-1] + arr[i][j];
            }
        }
    }

    int res = d[n-1][0]; // 시작은 첫번째 원소부터
    for(int i=0; i<n; i++){
        if(res < d[n-1][i]){ // 새로운 원소가 더 크면 대체
            res = d[n-1][i];
        }
    }

    cout << res << '\n';
}