#include <iostream>
using namespace std;

int main(){
    int n, c, v;
    int me = 0;
    int dad = 0;
    cin >> n;

    for(int i=0; i<n; i++){
        cin >> c >> v;
        me = c/v;
        dad = c%v;
        cout << "You get " << me << " piece(s) and your dad gets " << dad << " piece(s)." << '\n';
    }
}