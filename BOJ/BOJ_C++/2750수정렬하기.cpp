#include <iostream>
using namespace std;

int main(){
    int n, tmp;
    int arr[1000] = {};
    cin >> n;

    for(int i=0; i<n; i++){ 
        cin >> arr[i];
    }

    for(int j=0; j<n; j++){
        for(int k=0; k<n-1; k++){
            if(arr[k+1]<arr[k]){
                tmp = arr[k+1];
                arr[k+1] = arr[k];
                arr[k] = tmp;
            }
        }
    }
    for(int i=0; i<n; i++){
        cout << arr[i] <<'\n';
    }
    
}