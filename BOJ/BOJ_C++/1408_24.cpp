#include <iostream>
#include <string>
using namespace std;

typedef struct{
    int hour;
    int min;
    int sec;
}Time;

Time setTime(string time){
    return Time{
        stoi(time.substr(0, 2)), // string to int로 문자열을 정수로 변환
        stoi(time.substr(3, 2)), // string substr로 문자영을 index부터 length만큼 잘라서 사용
        stoi(time.substr(6, 2))
    };
}

void printTime(Time time){
    string hour = to_string(time.hour); // to_string: 숫자 타입의 데이터를 스트링 타입으로 변경
    string min = to_string(time.min);
    string sec = to_string(time.sec);

    hour = hour.length() == 1 ? '0' + hour : hour; // 0을 더해서 문자값으로 인식
    min = min.length() == 1 ? '0' + min : min;
    sec = sec.length() == 1 ? '0' + sec : sec;

    cout << hour << ":" << min << ":" << sec << '\n';
}

int main(){
    string currentTime, startTime;
    cin >> currentTime >> startTime;

    Time current = setTime(currentTime);
    Time start = setTime(startTime);

    Time result;
    result.sec = start.sec - current.sec;

    if(result.sec < 0){
        result.sec += 60;
        start.min--;
    }

    result.min = start.min - current.min;

    if(result.min < 0){
        result.min += 60;
        start.hour--;
    }

    result.hour = start.hour - current.hour;

    if(result.hour < 0){
        result.hour += 24;
    }

    printTime(result);
}