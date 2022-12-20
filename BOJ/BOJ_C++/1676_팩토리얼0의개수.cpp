#include <iostream>
using namespace std;
/*
팩토리얼을 전부 구하려고 하면 너무 복잡해진다.
0의 개수를 구하는 것이고 0의 개수는 2와 5의 곱으로만 만들어지기 때문에 2와 5의 개수를 구하면 된다.
이 때 2의 개수는 짝수마다 있어서 5보다는 무조건 많기 때문에 5의 배수의 개수를 구한다.
그리고 제곱수를 고려하여 1씩 더해주면 된다.
*/
int main(){
    int N;
    int cnt = 0;
    cin >> N;

    for(int i=5; i<=N; i*=5){
        cnt += N/i;
    }

    cout << cnt << '\n';
}