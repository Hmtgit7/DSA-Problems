#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n;
	cin>>n;
	while(n>0){
	    int X;
	    cin>>X;
	    if(X>=80) cout<<"YES\n";
	    else cout<<"NO\n";
	    --n;
	}
	return 0;
}
