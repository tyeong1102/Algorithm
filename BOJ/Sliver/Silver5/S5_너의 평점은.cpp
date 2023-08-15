#include <bits/stdc++.h>
using namespace std;

char subject[54], score[6];
double credit, ret, nScore, cnt;
int num = 20;

int main() {
    while(num--) {
        cin >> subject >> credit >> score;

        if(score[0] == 'A') nScore = 4.0;
        else if(score[0] == 'B') nScore = 3.0;
        else if(score[0] == 'C') nScore = 2.0;
        else if(score[0] == 'D') nScore = 1.0;
        else nScore = 0.0;

        if(score[1] == '+') nScore += 0.5;

        ret += (credit * nScore);

        if(score[0] == 'P') cnt += 0.0;
        else cnt += credit;
    }

    cout << ret / cnt << '\n';

}