#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
/*
처음에는 for문 2개를 사용해서 i번째와 j번째가 같으면 지워주는 코드를 짰는데 출력초과가 나왔다.
연속된 중복 원소를 쓰레기 값으로 보내는 unique를 하고 erase를 해서 중복된 값을 제거하였다.
*/
int main(){
    int n, input;
    vector<int> v;
    cin >> n;

    for(int i=0; i<n; i++){
        cin >> input;
        v.push_back(input);
    }

    sort(v.begin(), v.end());

    v.erase(unique(v.begin(), v.end()), v.end());

    for(int i=0; i<v.size(); i++){
        cout << v[i] << " ";
    }
}