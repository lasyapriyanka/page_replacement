package page;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fifo {
	public int pt=0;
	public int[] frame;
	public int[] pages;
 int f,page=0,ch,pgf=0,n,chn=0;
 boolean flag;
public fifo(int f,int n,int[] pages)
{
	frame=new int[f];
	 pages=new int[n];
    
}
public void set_values()throws IOException
{
	BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
//System.out.println("enter no. of frames: ");


for(int i=0;i<f;i++)
	{
	frame[i]=-1;
	}
//System.out.println("enter the no of pages ");
// n=Integer.parseInt(obj.readLine());
 //pages=new int[n];
do{
int pg=0;
for(pg=0;pg<n;pg++)
{

page=pages[pg];
flag=true;
for(int j=0;j<f;j++)
{
if(page==frame[j])
{
flag=false;
 break;
}
}
if(flag)
{
frame[pt]=page;
pt++;
if(pt==f)
pt=0;
System.out.print("frame :");
for(int j=0;j<f;j++)
System.out.print(frame[j]+"   ");

System.out.println();
pgf++;
}
else
{
System.out.print("frame :");
for(int j=0;j<f;j++)
System.out.print(frame[j]+"  ");

System.out.println();
}

chn++;
}
}while(chn!=n);
System.out.println("Page fault:"+pgf);



}
}
