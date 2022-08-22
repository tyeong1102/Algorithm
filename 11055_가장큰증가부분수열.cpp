#include <iostream>
#include <algorithm>
using namespace std;

int d[1001];
int arr[1001];

int main(){
    int n;
    cin >> n;

    for(int i=0; i<n; i++){
        cin >> arr[i];
    }

    for(int i=0; i<n; i++){
        d[i] = arr[i];
        for(int j=0; j<i; j++){
            if(arr[j] < arr[i] && d[i] < d[j] + arr[i]){
                d[i] = d[j] + arr[i];
            }
        }
    }

    sort(d, d+n);

    int res = d[n-1];

    cout << res << '\n';
}