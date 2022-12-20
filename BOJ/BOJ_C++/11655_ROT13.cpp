#include <iostream>
#include <string>
using namespace std;

int main(){
    string s;
    getline(cin, s);

    for(int i=0; i<s.size(); i++){
        if(s[i] == ' '){
            cout << ' ';
        } else if(s[i] >= 97 && s[i] <= 122){
            int res = (s[i]-97+13)%26;
            cout << char(res+97);
        } else if(s[i] >= 65 && s[i] <= 96){
            int res = (s[i]-65+13)%26;
            cout << char(res+65);
        } else{
            cout << s[i];
        }
    }
}