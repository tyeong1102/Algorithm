#include <iostream>
#include <cmath>
using namespace std;

int main(){
    int t;
    
    cin >> t;

    for(int i=0; i<t; i++){
        int n;
        int sumc = 0;
        double score = 0.0;
        double final = 0.0;

        cin >> n;
        for(int j=0; j<n; j++){
            int c;
            double g = 0.0;
            cin >> c >> g;
            sumc += c;
            score += c * g;
            final = score / sumc;

            final *= 10;
            final = round(final); // 반올림 해줌
            final /= 10;
        }
        cout << sumc << " " << final << '\n';
    }
}