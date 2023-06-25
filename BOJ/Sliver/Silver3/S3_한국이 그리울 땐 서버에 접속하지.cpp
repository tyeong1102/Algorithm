#include <bits/stdc++.h>
using namespace std;

int N;
string s, front, back, file;

int main(){
    cin >> N;
    cin >> s;

    int pos = s.find('*');
    front = s.substr(0, pos);
    back = s.substr(pos + 1);

    for(int i = 0; i < N; i++){
        cin >> file;
        if(front.size() + back.size() > file.size()){ // 반례. 접두사와 접미사를 더한 크기보다는 같거나 커야함.
            cout << "NE" << '\n';
        }else{
            if(front == file.substr(0, front.size()) && back == file.substr(file.size() - back.size())){
            cout << "DA" << '\n';
            } else {
            cout << "NE" << '\n';
            }
        }
        
    }
    
    return 0;
}