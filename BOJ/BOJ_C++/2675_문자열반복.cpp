#include <iostream>
#include <string>
using namespace std;

int main(){
    int t;
    cin >> t;

    for(int i=0; i<t; i++){
        string s;
        int r;
        cin >> r;
        cin >> s;

        for(int j=0; j<s.size(); j++){
            for(int k=0; k<r; k++){
                cout << s[j];
            }
        }
        cout << '\n';   
    }
}