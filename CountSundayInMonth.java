#include<iostream>
#include<string>
#include<vector>
using namespace std;
int main(int argc, char *argv[])
{
	string s;
	cin>>s;
	int d;
	cin>>d;
	int cnt=0;
	int startIndex;
	if(s=="son")  startIndex=0;
	else if(s=="mon")  startIndex=1;
	else if(s=="tue")  startIndex=2;
	else if(s=="wed")  startIndex=3;
	else if(s=="thur")  startIndex=4;
	else if(s=="frid")  startIndex=5;
	else if(s=="sat")  startIndex=6;
	else{
	     cout<<"Invalid start day";
	     return 1;
	}
	for(int i=0;i<d;i++){
		if((i+startIndex)%7==6)
		       cnt++;
	}
	cout<<cnt;
		      
}
