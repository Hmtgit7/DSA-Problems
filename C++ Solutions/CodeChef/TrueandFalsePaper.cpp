#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n;
	cin>>n;
	while(n>0){
	    int X,Y;
	    cin>>X>>Y;
	    int bobMark=X-Y;
	    cout<<bobMark<<"\n";
	    --n;
	}
	return 0;
}