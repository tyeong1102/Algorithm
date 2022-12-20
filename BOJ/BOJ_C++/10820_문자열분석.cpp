#include <iostream>
#include <string>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    for(int i=0; i<100; i++){
        string s;
        getline(cin, s);

        if(s.length() == 0){
            break;
        }

        int up=0, low=0, num=0, blank=0;
        
        for(int j=0; j<s.length(); j++){
            if(s[j] >= 'A' && s[j] <= 'Z'){
                up++;
            } else if(s[j] >= 'a' && s[j] <= 'z'){
                low++;
            } else if(s[j] >= '0' && s[j] <= '9'){
                num++;
            } else if(s[j] == ' '){
                blank++;
            }
        }
        cout << low << " " << up << " " << num << " " << blank << '\n';
    }
    return 0;
}