#include <iostream>
using namespace std;

int arr[101][101];

int main(){
    int n, x, y;
    int cnt = 0;
    cin >> n;

    while(n--){
        cin >> x >> y;

        for(int i=x; i<x+10; i++){
            for(int j=y; j<y+10; j++){
                if(arr[i][j] == 1){
                    continue;
                }
                arr[i][j] = 1;
                cnt++;
            }
        }
    }
    
    cout << cnt << '\n';
}