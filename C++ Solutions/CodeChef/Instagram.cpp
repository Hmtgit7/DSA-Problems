// Instagram
#include <iostream>
using namespace std;

int main() {
	// your code goes here
    int n;
    cin>>n;
    while(n>0){
        int x,y;
        cin>>x>>y;
        if(x>y*10){
            cout<<"YES\n";
        }
        else{
            cout<<"NO\n";
        }
    }
	return 0;
}