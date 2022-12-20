#include <iostream>
using namespace std;

/*
재귀함수 사용
*/

int human(int a, int b){
    if(b == 1){
        return 1;
    }
    if(a == 0){
        return b;
    }
    return (human(a-1, b) + human(a, b-1));
}

int main(){
    int t, a, b;
    cin >> t;

    for(int i=0; i<t; i++){
        cin >> a >> b;
        cout << human(a, b) << '\n';
    }
}