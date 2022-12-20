#include <iostream>
#include <cmath> // sqrt()
using namespace std;

int main(){
    int n;
    cin >> n;
    int cnt = n;
    int input[100];

    for(int i=0; i<n; i++){
        cin >> input[i];
        if(input[i] == 1){
            cnt--;
        }
    }

    // 에라토스테네스의 체
    for(int i=0; i<n; i++){
        for(int j=2; j<=sqrt(input[i]); j++){
            if(input[i]%j==0){
                cnt--;
                break;
            }
        }
    }
    cout << cnt;
}