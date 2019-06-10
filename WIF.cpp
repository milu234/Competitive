#include <bits/stdc++.h>
using namespace std;
int main()
{
    short int t;
    cin>>t;
    while(t--)
    {
      short int n,m;
        cin>>n>>m;
        short int arr[n][m],a[n][m],a1[n][m],b[n][m],co=0,mn=INT_MAX;
        for(int i=0;i<n;i++)
         for(int j=0;j<m;j++)
          arr[i][j]=co++;
        for(int i=0;i<n;i++)
         for(int j=0;j<m;j++)
         {
         cin>>a1[i][j];
         }
         vector<pair<short int,pair<short int,short int>>> vp,vp1;
         vector<pair<short int,short int>> out,mai;
         for(int i=0;i<n;i++)
          for(int j=0;j<m;j++)
         {
            cin>>b[i][j];
         
          }
        short int vg=402;
         for(int hj=0;hj<2;hj++,vg++)
         {
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        {
        a[i][j]=a1[i][j];
        }
         for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        {
           short int cd=0;
            for(int i1=max(i-b[i][j],0);i1<=min(n-1,i+b[i][j]);i1++)
            cd+=a[i1][j];
            for(int j1=max(j-b[i][j],0);j1<=min(m-1,j+b[i][j]);j1++)
            cd+=a[i][j1];
            cd-=a[i][j];
            vp.push_back(make_pair(cd,make_pair(i,j)));
        }
        sort(vp.begin(),vp.end());
        for(int f=0;f<=4;f++)
        {
        for(int i=vp.size()-1;i>=0;i--)
        {
            int x=vp[i].second.first,y=vp[i].second.second,cd=0;
            
            for(int i1=max(x-b[x][y],0);i1<=min(n-1,x+b[x][y]);i1++)
            cd+=a[i1][y];
            for(int j1=max(y-b[x][y],0);j1<=min(m-1,y+b[x][y]);j1++)
            cd+=a[x][j1];
            cd-=a[x][y];
            
            if(cd>((vp[i].first*vg)/1000))
            {
                out.push_back(make_pair(x,y));
                for(int i1=max(x-b[x][y],0);i1<=min(n-1,x+b[x][y]);i1++)
                a[i1][y]=0;
                for(int j1=max(y-b[x][y],0);j1<=min(m-1,y+b[x][y]);j1++)
                a[x][j1]=0;
            }
        }
        vp.clear();
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        {
           short int cd=0;
            for(int i1=max(i-b[i][j],0);i1<=min(n-1,i+b[i][j]);i1++)
            cd+=a[i1][j];
            for(int j1=max(j-b[i][j],0);j1<=min(m-1,j+b[i][j]);j1++)
            cd+=a[i][j1];
            cd-=a[i][j];
            vp.push_back(make_pair(cd,make_pair(i,j)));
        }
        sort(vp.begin(),vp.end());
    }
        for(int i=vp.size();i>0;i--)
        {
           short int x=vp[i].second.first,y=vp[i].second.second,cd=0;
            
            for(int i1=max(x-b[x][y],0);i1<=min(n-1,x+b[x][y]);i1++)
            cd+=a[i1][y];
            for(int j1=max(y-b[x][y],0);j1<=min(m-1,y+b[x][y]);j1++)
            cd+=a[x][j1];
            cd-=a[x][y];
            
            if(cd>0)
            {
                out.push_back(make_pair(x,y));
                for(int i1=max(x-b[x][y],0);i1<=min(n-1,x+b[x][y]);i1++)
                a[i1][y]=0;
                for(int j1=max(y-b[x][y],0);j1<=min(m-1,y+b[x][y]);j1++)
                a[x][j1]=0;
            }
        }
        if(out.size()<=mn)
        {
            mai=out;
            mn=out.size();
        }
         }
        cout<<mai.size()<<endl;
        for(int i=0;i<mai.size();i++)
        cout<<mai[i].first<<" "<<mai[i].second<<endl;
    }
    
}