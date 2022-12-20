#include <iostream>
#include <deque>
using namespace std;

int main(){
    deque<int> d;
    int n, m;
    int front, rear;
    int cnt = 0;

    cin >> n >> m;
    
    // 처음에 i=0으로 설정해서 0부터 들어가서 1을 검색해도 cnt가 무조건 1증가하는 현상 발생.
    for(int i=1; i<=n; i++){
        d.push_back(i);
    }

    while(m--){
        int num;
        cin >> num;

        for(int i=0; i<d.size(); i++){
            if(d[i]==num){
                front = i;
                break;
            }
        }
        if(front<=d.size()-front){
            while(1){
                if(d.front()==num){
                    break;
                }
                d.push_back(d.front());
                d.pop_front();
                cnt++;
            }
            d.pop_front();
        }

        else{
            cnt++;
            while(1){
                if(d.back()==num){
                    break;
                }
                d.push_front(d.back());
                d.pop_back();
                cnt++;
            }
            d.pop_back();
        }
    }
    cout << cnt;
}