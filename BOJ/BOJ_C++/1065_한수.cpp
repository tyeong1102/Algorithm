#include <iostream>
using namespace std;

int arithmetic_sequence(int n){
    int cnt = 0;

    if(n < 100){
        return n;
    } else {
        cnt = 99;

        for(int i=100; i<=n; i++){
            int hun = i / 100;
            int ten = (i / 10) % 10;
            int one = i % 10;

            if((hun - ten) == (ten - one)){
                cnt++;
            }
        }
        return cnt;
    }
}

int main(){
    int N;
    cin >> N;

    int res = arithmetic_sequence(N);
    cout << res;
}