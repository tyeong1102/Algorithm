#include <iostream>
using namespace std;

int main(){
    int n = 10;
    int price[9];
    int sum = 0;
    int total;
    
    cin >> total;

    for(int i=0; i<n-1; i++){
        cin >> price[i];
        sum += price[i];
    }

    cout << total - sum << '\n';
}