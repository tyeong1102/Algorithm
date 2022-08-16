#include <iostream>
using namespace std;

int main(){
    int h, w, n;
    int t;
    int res;
    cin >> t;

    for(int i=0; i<t; i++){
        cin >> h >> w >> n;
        int floor;
        int room;
        

        floor = n % h;
        room = n / h + 1;

        if(floor == 0){
            res = h*100 + n/h;
        } else{
            res = floor*100 + room;
        }
        cout << res << '\n';
    }
}