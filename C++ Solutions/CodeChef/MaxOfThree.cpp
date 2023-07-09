#include <iostream>
using namespace std;

int main() {
	// your code goes here
		int n;
		cin>>n;
		while(n>0){
		    int A,B,C;
		    cin>>A>>B>>C;
		    if(A>=B && A<C ||A>=C && A<B)
		    {
		        cout<<A;
		    }
		    if(B>=C && B<A ||B>=A && B<C)
		    {
		        cout<<B;
		    }
		    if(C>=B && C<A || C>=A && C<B)
		    {
		        cout<<C;
		    }
		    
		    --n;
		}
	return 0;
}
