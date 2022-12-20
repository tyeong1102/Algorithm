#include <iostream>

using namespace std;

/*
6씩 늘어나는 걸 알면 편하다.
*/

int main(){
    int n;
    int cnt = 1;
    int m = 1;
    cin >> n;
    
    while(n>m){
        m += (6 * cnt);
        cnt++;
    }

    cout << cnt;
}