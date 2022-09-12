#include <iostream>
using namespace std;

char chess[51][51];

char white[8][8] = {
    'W','B','W','B','W','B','W','B',
    'B','W','B','W','B','W','B','W',
    'W','B','W','B','W','B','W','B',
    'B','W','B','W','B','W','B','W',
    'W','B','W','B','W','B','W','B',
    'B','W','B','W','B','W','B','W',
    'W','B','W','B','W','B','W','B',
    'B','W','B','W','B','W','B','W',
};

char black[8][8] = {
    'B','W','B','W','B','W','B','W',
    'W','B','W','B','W','B','W','B',
    'B','W','B','W','B','W','B','W',
    'W','B','W','B','W','B','W','B',
    'B','W','B','W','B','W','B','W',
    'W','B','W','B','W','B','W','B',
    'B','W','B','W','B','W','B','W',
    'W','B','W','B','W','B','W','B',
};

int blackFirst(int x, int y){
    int cnt = 0;
    for(int i=0; i<8; i++){
        for(int j=0; j<8; j++){
            if(chess[x+i][y+j] != black[i][j]){
                cnt++;
            }
        }
    }
    return cnt;
}

int whiteFirst(int x, int y){
    int cnt = 0;
    for(int i=0; i<8; i++){
        for(int j=0; j<8; j++){
            if(chess[x+i][y+j] != white[i][j]){
                cnt++;
            }
        }
    }
    return cnt;
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int N, M;
    int cnt = 64;
    cin >> N >> M;

    for(int i=0; i<N; i++){
        for(int j=0; j<M; j++){
            cin >> chess[i][j];
        }
    }

    int cBlack, cWhite;
    for(int i=0; i<=N-8; i++){
        for(int j=0; j<=M-8; j++){
            cBlack = blackFirst(i, j);
            cWhite = whiteFirst(i, j);

            if (cWhite < cBlack) {
				cnt = (cWhite < cnt) ? cWhite : cnt;
			}
			else {
				cnt = (cBlack < cnt) ? cBlack : cnt;
			}
        }
    }
    cout << cnt << '\n';
}