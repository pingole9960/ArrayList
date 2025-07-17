//✅ 6. Find Missing Number (1 to N)
//Logic: Use sum of N natural numbers - actual sum.//✅ 6. Find Missing Number (1 to N)
#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

int main(int argc, char *argv[])
{
     int n;
     cin>>n;
     vector<int>arr(n);
     for(int i=0;i<arr.size();i++){
     	cin>>arr[i];
     }
     int s=0;
     for(int i=0;i<arr.size();i++)
     {
     	s+=arr[i];
     }
     int prod=n*(n-1)/2;
     cout<<prod-s;
     	
}
