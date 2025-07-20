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
	int target;
	cin>>target;
	int s;
	sort(arr.begin(),arr.end());
	int left=0,right=n-1;
	while(left<right){
		s+=arr[left]+arr[right];
		if(s==target)
		      cout<<arr[left]<<arr[right];
		else if(s<target)
		       left++;
		 else
		       right--;
	}
	
}
