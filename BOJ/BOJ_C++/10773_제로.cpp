#include <iostream>
#include <stack>
using namespace std;

int main(){
    stack<int> s;
    int k, num;
    int size;
    int sum = 0;
    cin >> k;

    for(int i=0; i<k; i++){
        cin >> num;

        if(num == 0){
            s.pop();
        } else{
            s.push(num);
        }
    }

    size = s.size();
    for(int i=0; i<size; i++){
        sum += s.top();
        s.pop();
    }

    cout << sum << '\n';

    return 0;
}