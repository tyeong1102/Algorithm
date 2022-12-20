#include <iostream>
#include <string>
using namespace std;

int main(){
    int t;
    string s;
    cin >> t;

    for(int i=0; i<t; i++){
        cin >> s;
        cout << s[0];
        
        if(s.size() == 1){
            cout << s[0];
        } else{
            cout << s[s.size()-1];
        }
        
        cout << '\n';
    }
}