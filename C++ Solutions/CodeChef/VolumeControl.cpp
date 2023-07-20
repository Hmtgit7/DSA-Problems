#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n; 
	cin>>n;
	while(n>0){
	   int X,Y;
	   cin>>X>>Y;
	   if(Y>X){
	       cout<<Y-X<<"\n";
	   }
	   else cout<<X-Y<<"\n";
	    --n;
	}
	return 0;
}