#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int x, y, z;

    while(true){
        int cal;
        cin >> x >> y >> z;
        int arr[3]={x,y,z};

        if(x==0 && y==0 && z==0){
            break;
        }

        sort(arr, arr+3);        
        cal = arr[0]*arr[0] + arr[1]*arr[1];

        if(cal == arr[2]*arr[2]){
            cout << "right" << '\n';
        } else{
            cout << "wrong" << '\n';
        }
    }
}