#include <string>
#include <vector>

using namespace std;

int change(int num) {
    int cnt = 0;
    
    while(num > 0) {
        if(num % 2 == 1) cnt++;
        num /= 2;
    }
    
    return cnt;
}

int solution(int n) {
    int add = 1;
    int answer = 0;
    
    while(1) {
        if(change(n) == change(n + add)) {
            answer = n + add;
            break;
        }
        add++;
    }
    
    return answer;
}