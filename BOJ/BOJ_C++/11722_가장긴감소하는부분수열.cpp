#include <iostream>
using namespace std;

int d[1001];
int arr[1001];

int main(){
    int n;
    int cnt = 0;
    cin >> n;

    for(int i=1; i<=n; i++){
        cin >> arr[i];
    }

    for(int i=n; i>=1; i--){
        d[i] = 1;
        for(int j=i+1; j<=n; j++){
            if(arr[i]>arr[j] && d[i]<d[j]+1){
                d[i] = d[j] + 1;
            }
        }
    }

    int res = d[1];
    for(int i=2; i<=n; i++){
        if(res < d[i]){
            res = d[i];
        }
    }

    cout << res << '\n';
}