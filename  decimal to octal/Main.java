#include<stdio.h>
int main()
{
  int n,a[100],i;
  scanf("%d",&n);
  while(n!=0)
  {
    a[i++]=n%8;
    n=n/8;
  }
  for(i=i-1;i>=0;i--)
  {
    printf("%d",a[i]);
  }
  //type your code here
  return 0;
}