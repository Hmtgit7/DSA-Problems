#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n;
	cin>>n;
	while(n>0){
	    int N,X;
	    cin>>N>>X;
	    if(N>X) cout<<"NO\n";
	    else cout<<"YES\n";
	    --n;
	}
	return 0;
}
