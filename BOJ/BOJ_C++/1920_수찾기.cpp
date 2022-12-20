#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int n, m;
int arr[100001];

void binarySearch(int input){
	int low = 0;
    int high = n - 1;
    int mid;
    
    while(low <= high){
    	mid = (low + high) / 2;
    
        if(arr[mid] == input){
            cout << '1' << '\n';
            return;
        } else if(arr[mid] < input){
            low = mid + 1;
        } else if(arr[mid] > input){
            high = mid - 1;
        }
    }
    cout << '0' << '\n';
    return;
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    cin >> n;
    
    for(int i=0; i<n; i++){
        cin >> arr[i];
    }

    sort(arr, arr+n);

    cin >> m;

    for(int i=0; i<m; i++){
        int x;
        cin >> x;
        binarySearch(x);
    }
}