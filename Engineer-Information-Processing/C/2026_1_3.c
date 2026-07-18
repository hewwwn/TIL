//이 문제는 배열의 평균을 구하는 두 가지 방법을 보여주는 예제이다.
#include <stdio.h>
double arr1(int p[], int len) {
    double av = 0;
    int i;
    for(i = 0; i < len; i++) { 
        av += (double)p[i];
    }
    return av / len; //평균을 구하는 문제
}
double arr2(int *p, int len) {
    double av = 0;
    int i;
    for(i = 0; i < len; i++) {
        av += (double)(*(p + i));
    }
    return av / len; //이하 같음
}
int main(){
    int arr[10] = {70, 50, 80, 30, 45, 55, 65, 95, 15, 25};
    int len = 10;
    printf("%.2f", arr1(arr, len) + arr2(arr, len));
    return 0;
}
//arr1과 arr2는 배열의 평균을 구하는 함수이다. arr1은 배열을 직접 전달받아 평균을 계산하고, arr2는 포인터를 사용하여 배열의 요소에 접근하여 평균을 계산한다. main 함수에서는 두 함수의 결과를 더하여 출력한다. 
// 출력 결과는 106.00이다.
// 답을 적을 때, %2.f 형식을 사용하여 소수점 둘째 자리까지 출력해서 적는 걸 조심하자!