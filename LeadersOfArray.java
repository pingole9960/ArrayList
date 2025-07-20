#include<iostream>
#include<vector>

using namespace std;
int main(int argc, char *argv[])
{
	int n;
	cin>>n;
	vector<int>arr(n);
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
    vector<int>lead;
    int maxi=INT_MIN;
    for(int i=n-1;i>=0;i--){
    	if(arr[i]>maxi){
    	       lead.push_back(arr[i]);
    	}
    	maxi=max(maxi,arr[i]);
    }
    for(auto it:lead){
    	cout<<it<<" ";
    }
    
}
