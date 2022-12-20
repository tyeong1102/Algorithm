#include <iostream>
using namespace std;

int main(){
    int n = 9;
    int input;
    int max = 0;
    int cnt = 0;

    for(int i=0; i<n; i++){
        cin >> input;
        if(input > max){
            max = input;
            cnt = i+1;
        }
    }

    cout << max << endl;
    cout << cnt;
     
}