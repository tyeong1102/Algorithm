#include <iostream>
#include <string>
using namespace std;

int main(){
    string s;
    int arr[26] = {};
    cin >> s;

    for(int i=0; i<s.size(); i++){
        if(s[i] > 96 && s[i] < 123){
            arr[s[i]-97]++;
        }
    }

    for(int i=0; i<26; i++){
        cout << arr[i] << " ";
    }
}