#include <iostream>
#include <string>
using namespace std;

int main(){
    string s;
    int cnt = 0;
    cin >> s;

    for(int i=0; i<s.length(); i++){
        if(s[i] == ','){
            cnt++;
        }
    }

    cout << cnt + 1;
}