#include <iostream>
using namespace std;

int main(){
    int n;
    cin >> n;

    for(int i=0; i<n; i++){
        int num = i;
        int temp = i;

        while(temp > 0){
            num += temp % 10;
            temp /= 10;
        }
        
        if(num == n){
            cout << i << '\n';
            n = 0;
            break;
        }
    }

    if(n != 0){
        cout << '0';
    }
}