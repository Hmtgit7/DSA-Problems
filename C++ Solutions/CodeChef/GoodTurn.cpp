// GOOD TURN PROBLEM CODECHEF
#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int N,X,Y;
	cin>>N;
	while(N>0){
	cin>>X>>Y;
	    N--;
	if((X+Y)>6)
	    cout<<"YES\n";
	else
	    cout<<"NO\n";
	}
	return 0;
}
