#include <iostream>
using namespace std;

int main(){
    int n;
    cin >> n;
    
    int t = 2;
    if(n!=1){
        while(n>1){
            if(n%t==0){
                cout << t << '\n';
                n /= t;
            } else{
                t++;
            }
        }
    }
}