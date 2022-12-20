#include <iostream>
using namespace std;

int main(){
    int N;
    int arr[1000000];

    cin >> N;

    for(int i=0; i<N; i++){
        cin >> arr[i];
    }

    int min = arr[0], max = arr[0];
    for(int j=0; j<N; j++){
        if(arr[j] < min){
            min = arr[j];
        }
        if(arr[j] > max){
            max = arr[j];
        }
    }

    cout << min << " " << max;
}