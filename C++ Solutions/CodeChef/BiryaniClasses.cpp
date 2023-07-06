#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n;
	cin>>n;
	while(n>0){
	    int X,Y,totalAmount;
	    cin>>X>>Y;
	    totalAmount=X*Y;
	    cout<<totalAmount<<"\n";
	    --n;
	}
	return 0;
}
