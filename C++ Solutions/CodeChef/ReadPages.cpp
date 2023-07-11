// Read Pages

#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n;
	cin>>n;
	while(n>0){
	    int N,X,Y;
	    cin>>N>>X>>Y;
	    //tpr=total pages read
	    int tpr=X*Y;
	    if(tpr>=N) cout<<"YES\n";
	    else cout<<"NO\n";
	    --n;
	}
	return 0;
}
