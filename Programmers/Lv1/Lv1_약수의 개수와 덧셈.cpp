#include <string>
#include <vector>

using namespace std;

int solution(int left, int right) {
    int answer = 0;
    
    while(left <= right) {
        int cnt = 1;
        
        for(int i = 1; i < left / 2 + 1; i++) {
            if(left % i == 0) cnt++;
        }
        
        if(cnt % 2 == 0) answer += left;
        else answer -= left;
        
        left++;
    }
    
    return answer;
}