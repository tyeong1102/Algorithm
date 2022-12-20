#include <iostream>
using namespace std;

int main(){
    int n, p;
    int cost;
    string name;

    cin >> n;

    for(int i=0; i<n; i++){
        cin >> p;
        int top = 0; // 비싼 선수의 가격을 비교하기 위한 변수
        string topname; // 비싼 선수 이름을 기록하기 위한 문자열
        for(int j=0; j<p; j++){
            cin >> cost >> name;
            if(cost>=top){ // cost가 비싼 선수를 기록
                top = cost; 
                topname = name;
            }
        }
        cout << topname << '\n';
    }
    return 0;
}