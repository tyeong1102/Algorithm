#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main(){
    string s1;
    

    while(true){
        cin >> s1;

        string s2 = s1;
        
        reverse(s1.begin(), s1.end());

        if(s1 == "0"){
            break;
        } else if(s1 == s2){
            cout << "yes" << '\n';
        } else{
            cout << "no" << '\n';
        }
    }
}