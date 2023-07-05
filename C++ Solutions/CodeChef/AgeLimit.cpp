#include<iostream>
using namespace std;

int main(){
    int n;
    cin>>n;
    while(n>0){
        int x,y,a;
        cin>>x>>y>>a;
        if(a>=x && a<y){
            cout<<"YES";
        }
        else{
            cout<<"No";
        }
    }
}