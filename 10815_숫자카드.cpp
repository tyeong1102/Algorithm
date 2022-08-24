#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
	cin.tie(nullptr);

    int n, m;
    cin >> n;
    vector<int> v1(n, 0);
    for(int i=0; i<n; i++){
        cin >> v1[i];
    }

    sort(v1.begin(), v1.end());

    cin >> m;
    vector<int> v2(m, 0);
    vector<int> v3(m, 0);
    for(int i=0; i<m; i++){
        cin >> v2[i];
    }

    for(int i=0; i<m; i++){
        int right = n-1;
        int left = 0;
        while(left <= right){
            int mid = (right + left) / 2;
            if(v1[mid] == v2[i]){
                v3[i]++;
                break;
            } else if(v1[mid] > v2[i]){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    }
    
    for(int i=0; i<m; i++){
        cout << v3[i] << ' ';
    }
}