#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n;
	cin>>n;
	while(n>0){
	    int X;
	    cin>>X;
	    if(X<=3) cout<<"BRONZE\n";
	    else if(X>6)  cout<<"GOLD\n";
	    else cout<<"SILVER\n";
	    --n;
	}
	return 0;
}
