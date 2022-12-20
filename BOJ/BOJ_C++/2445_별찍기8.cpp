#include <iostream>
using namespace std;

int main(){
    int n;
    cin >> n;

    for(int i=1; i<n; i++){
        for(int j=i; j>0; j--){
            cout << "*";
        }
        for(int j=2*n-2*i; j>0; j--){
            cout << " ";
        }
        for(int j=i; j>0; j--){
            cout << "*";
        }
        cout << '\n';
    }

    for(int i=n; i>0; i--){
        for(int j=0; j<i; j++){
            cout << "*";
        }
        for(int j=2*n-2*i; j>0; j--){
            cout << " ";
        }
        for(int j=i; j>0; j--){
            cout << "*";
        }
        cout << '\n';
    }
}