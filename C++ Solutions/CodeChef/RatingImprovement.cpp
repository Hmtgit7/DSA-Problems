#include <iostream>
using namespace std;

int main() {
	// your code goes here
    int n;
    cin>>n;
    while(n>0){
        int x,y;
        cin>>x>>y;
        int result=y-x;
        if(result>200 || y<x) cout<<"NO\n";
        else cout<<"YES\n";
        --n;
    }
	return 0;
}