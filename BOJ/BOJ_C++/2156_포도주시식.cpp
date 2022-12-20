#include <iostream>
using namespace std;

/*
처음에는 d[i][j] 배열을 만들어서 i에 잔의 개수를 넣고 j에 연속해서 마신 횟수를 넣으려고 하였다.
그러나 이 방법으로 연속3잔 이상을 처리할 수 없어서 1잔과 2잔 마셨을 때 값은 for문 안에 넣지 않고,
i=3부터 1잔과 2잔을 연속으로 마셨을 때만 고려하였다.
*/

int d[10001]; // 잔의 개수
int arr[10001]; // 포도주 양

int main(){
    int n;
    cin >> n;

    for(int i=1; i<=n; i++){
        cin >> arr[i]; // 포도주 양 입력
    }
    
    d[1] = arr[1];
    d[2] = arr[1] + arr[2];

    for(int i=3; i<=n; i++){
        d[i] = d[i-1];
        if(d[i] < d[i-2] + arr[i]){ // 1잔 마심
            d[i] = d[i-2] + arr[i];
        }
        if(d[i] < d[i-3] + arr[i] + arr[i-1]){ // 2잔 마심
            d[i] = d[i-3] + arr[i] + arr[i-1];
        }
    }

    cout << d[n] << '\n';
}