#include <iostream>
using namespace std;

int main(){
    int x;
    int n, m;
    cin >> x;

    for(int i=1; i<=x; i++){
        int sum = 0;
        cin >> n >> m;
        sum = n + m;
        cout << "Case " << i <<": " << sum << '\n';
    }
}