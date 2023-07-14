#include <iostream>
using namespace std;

int main() {
	// your code goes here
    int n;
    cin>>n;
    while(n>0){
        int x,y;
        cin>>x>>y;
        if(x<y) cout<<"FIRST\n";
        else if(x>y) cout<<"SECOND\n";
        else cout<<"ANY\n";
        --n;
    }
	return 0;
}
