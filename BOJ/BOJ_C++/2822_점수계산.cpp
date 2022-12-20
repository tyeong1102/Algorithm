/* 
처음에는 arr을 따로 만들어서 삽입허고 그것을 vector에 넣어 내림차순으로 정렬하였다.
위의 방법으로는 index 번호를 비교하는데 어려움이 있어 pair을 사용해 값과 index를 묶어 저장하였다.
내림차순으로 정렬하여 합을 구하고, 다시 올림차순으로 index를 정렬하였다.
*/

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int sum = 0;
    vector<pair<int,int>> v(8);
    vector<int> idx;

    for(int i=0; i<8; i++){ // 8개 입력
        cin >> v[i].first;
        v[i].second = i + 1;
    }

    sort(v.begin(), v.end(), greater<pair<int, int>>()); // 내림차순으로 정렬

    for(int j=0; j<5; j++){ // 내림차순 상위 5개 합
        sum += v[j].first;
        idx.push_back(v[j].second);
    }
    cout << sum << '\n';

    sort(idx.begin(), idx.end());
    for(int k=0; k<idx.size(); k++){
        cout << idx[k] << " ";
    }
}