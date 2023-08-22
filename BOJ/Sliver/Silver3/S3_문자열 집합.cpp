/*
    직전 값을 저장하는 변수는 prev로 사용하기로 하자. 시간을 다루는 경우 하나의 단위(초)로 통일하는 것이 계산에 편리하다.
    "00"을 더한 이유는 예를들어, 만약 한자리 수가 나올 경우 20:01이 나와야하는데 20:1이 나올 수도 있기 때문이다.
    그래서 cut함수를 구현하여 뒤에서 2자리를 출력하게 하였다.
*/

#include <bits/stdc++.h>
using namespace std;

int n, team, acnt, bcnt, awin, bwin; 
string s, temp, amin, asec, bmin, bsec;

int change(string a){
    return atoi(a.substr(0, 2).c_str()) * 60 + atoi(a.substr(3, 2).c_str());
}

string cut(string a) {
    return a.substr(a.size() - 2, 2);
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> n;

    for(int i = 0; i < n; i++) {
        cin >> team >> s;

        if(acnt > bcnt) awin += (change(s) - change(temp));
        if(bcnt > acnt) bwin += (change(s) - change(temp));

        team == 1 ? acnt++ : bcnt++;
        temp = s;
    }

    if(acnt > bcnt) awin += (change("48:00") - change(temp));
    else if(bcnt > acnt) bwin += (change("48:00") - change(temp)); 

    amin = "00" + to_string(awin / 60);
    asec = "00" + to_string(awin % 60);

    bmin = "00" + to_string(bwin / 60);
    bsec = "00" + to_string(bwin % 60);

    cout << cut(amin) + ":" + cut(asec) << '\n';
    cout << cut(bmin) + ":" + cut(bsec) << '\n';
}