#include <string>
#include <vector>

using namespace std;

vector<int> solution(int brown, int yellow) {
    vector<int> answer;
    
    int sum = brown + yellow;
    
    for(int i = 3; i <= sum; i++) {
        if(sum % i == 0) {
            int n = sum / i;
            
            if((i - 2) * (n - 2) == yellow) {
                answer.push_back(n);
                answer.push_back(i);
                break;
            }
        }
    }
    
    return answer;
}