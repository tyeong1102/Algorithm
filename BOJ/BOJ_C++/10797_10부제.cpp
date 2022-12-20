#include <iostream>
using namespace std;

int main(){
    int n, m;
    int cnt = 0;
    cin >> n;

    for(int i=0; i<5; i++){
        cin >> m;
        if(n==m){
            cnt++;
        }
    }
    cout << cnt << '\n';
}