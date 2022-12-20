#include <iostream>
using namespace std;

int main(){
    int n;
    int a, b;
    int left;
    int sum = 0;
    cin >> n;

    for(int i=0; i<n; i++){
        cin >> a >> b;
        left = b%a;
        sum += left;
    }
    cout << sum << '\n';
}