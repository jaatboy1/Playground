#include<stdio.h>
#include<math.h>
int main()
{
  int n,a,r,t_s1,t_s2,nterm;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=1;
    r=2;
    t_s1=(n+1)/2;
    nterm=a*pow(r,t_s1-1);
    printf("%d",nterm);
  }
  else
  {
    a=1;
    r=3;
    t_s2=n/2;
    nterm=a*pow(r,t_s2-1);
    printf("%d",nterm);
  }
  //type your code here
  return 0;
}