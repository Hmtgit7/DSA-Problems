#include <iostream>
using namespace std;

int main() {
	// your code goes here
int T;
	cin>>T;
	while(T>0){
	    int X,Y;
	    cin>>X>>Y;
	    if(2*X>5*Y){
	        cout<<"Chocolate"<<endl;
	    }
	    else if(2*X==5*Y){
	        cout<<"Either"<<endl;
	    }
	    else
	    {
	        cout<<"Candy"<<endl;
	    }
	    --T;
	}
	return 0;
}
