#include <iostream>
using namespace std;

int main(){
    int n; 
    int rem[42] = {};
    int cnt = 0;
    
    for(int i=0; i<10; i++){
        cin >> n;
        rem[n%42]++;
    }

    for(int i=0; i<42; i++){
        if(rem[i]!=0){
            cnt++;
        }
    }
    cout << cnt << '\n';
}