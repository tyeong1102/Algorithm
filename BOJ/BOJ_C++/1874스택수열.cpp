#include <iostream>
#include <stack>
#include <vector>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
	cin.tie(nullptr);

    int n;
    int m = 1;
    cin >> n;

    stack<int> s;
    vector<char> v;
    for(int i=1; i<=n; i++){
        int t;
        
        cin >> t;

        while(m<=t){
            s.push(m);
            m ++;
            v.push_back('+');
        }

        if(s.top() == t){
            s.pop();
            v.push_back('-');
        } else{
            cout << "NO";
            return 0;
        }
    }

    for(int i=0; i<v.size(); i++){
        cout << v[i] << '\n';
    }
}