#include <iostream>
using namespace std;

int main(){
    int k, p, m;
    int seat;
    cin >> k;

    for(int i=0; i<k; i++){
        bool arr[501] = {};
        int cnt = 0;
        cin >> p >> m;
        for(int j=0; j<p; j++){
            cin >> seat;

            if(arr[seat]){
                cnt++;
            } else{
                arr[seat] = 1;
            }
        }
        cout << cnt << '\n';
    }
}