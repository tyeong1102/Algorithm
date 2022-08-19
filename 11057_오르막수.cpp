#include <iostream>
using namespace std;

int d[1001][10];

int main(){
    int n;
    int res = 0;
    cin >> n;

    for(int i=0; i<=9; i++){
        d[1][i] = 1;
    }

    for(int i=2; i<=n; i++){
        for(int j=0; j<=9; j++){
            if(j == 0){
                d[i][0] = 1;
                continue;
            }
            d[i][j] = d[i-1][j] + d[i][j-1];
            d[i][j] %= 10007;
        }
    }

    for(int i=0; i<10; i++){
        res += d[n][i];
    }

    cout << res % 10007;
}