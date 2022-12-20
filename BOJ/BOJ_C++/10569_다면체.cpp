#include <iostream>
using namespace std;

int main(){
    int t;
    int v, e, m;
    cin >> t;

    for(int i=0; i<t; i++){
        cin >> v >> e;
        m = e - v + 2;
        cout << m << '\n';
    }
}