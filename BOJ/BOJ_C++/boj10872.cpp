#include <iostream>
using namespace std;

int main(){
    int N;
    int mul = 1;

    cin >> N;

    for(int i=1; i<=N; i++){
        mul *= i;
    }

    cout << mul;
}