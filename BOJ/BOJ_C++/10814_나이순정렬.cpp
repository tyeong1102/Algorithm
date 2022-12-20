#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

bool compare(const pair<int, string> &a, const pair<int, string> &b){
    return a.first < b.first;
}

int main(){
    vector<pair<int, string>> v; // 나이, 이름
    int n;
    cin >> n;

    for(int i=0; i<n; i++){
        int age;
        string name;
        cin >> age >> name;
        v.push_back({age, name});
    }

    stable_sort(v.begin(), v.end(), compare); // 원래 순서를 유지시켜줌
    
    for(int i=0; i<n; i++){
        cout << v[i].first << ' ' << v[i].second << '\n';
    }
}