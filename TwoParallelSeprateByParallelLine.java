#include<iostream>
#include<set>
#include<vector>
using namespace std;
int main(int argc, char *argv[])
{
	int n,m;
	cin>>n;
	vector<int>A(n);
	for(int i=0;i<n;i++){
		cin>>A[i];
	}
	cin>>m;	
	vector<int>B(m);
	for(int i=0;i<m;i++){
		cin>>B[i];
	}
	set<int>st;
	for(int i=0;i<n;i++) st.insert(A[i]);
	for(int i=0;i<m;i++) st.insert(B[i]);
    vector<int>merge(st.begin(),st.end());
    int size=merge.size();
    double median;
    if(size%2==1){
          median=merge[size/2];
    }
    else{
         median=(merge[size/2-1]+merge[size/2])/2.0;
    }
    cout<<median;
         
}
