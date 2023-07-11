#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    while(n>0){
        int G,B;
        cin>>G>>B;
        int result=B-G;
        cout<<result<<"\n";
        --n;   
    }
}