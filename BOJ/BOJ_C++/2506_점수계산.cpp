#include <iostream>
using namespace std;

int main(){
    int n;
    int sum = 0;
    int total = 0;
    cin >> n;

    for(int i=0; i<n; i++){
        int m;
        cin >> m;
        if(m==1){
            total++;
            sum += total;
        } else{
            total = 0;
        }
    }
    cout << sum << '\n';
}