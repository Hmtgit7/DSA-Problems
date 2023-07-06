#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n;
	cin>>n;
	while(n>0){
	    int rank;
	    cin>>rank;
	    if(rank>10){
	        cout<<"NO\n";
	    }
	    else{
	        cout<<"YES\n";
	    }
	    n--;
	}
	return 0;
}
