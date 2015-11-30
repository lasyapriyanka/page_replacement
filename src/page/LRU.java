package page;
import java.util.Scanner;

import sample.Dinning_Philospher;
public class LRU {
	private int[] Frames;
	private int[] Pages;
	private int[] a;
	private int num;
	public int Run;
	private int i=0;
	private int j=0,k=-1,f=0;
	Page_Replacement_Algorithm ans=new Page_Replacement_Algorithm();
	public LRU(int n,int[] pages)
	{
		//constructor
		//initialization
		num = n;
		Frames = new int[3];
		Pages = new int[n];
		for(int i=0;i<num;i++)
		{
			Pages[i]=pages[i];
		}
	}
	public int Run()
	{
		Frames[0]=Pages[0];Frames[1]=Pages[1];Frames[2]=Pages[2];
		for(i=3;i<num;i++)
		{
			f=1;
			for(int j=0;j<3;j++)
			{
			if(Pages[i]==Frames[j])
			{f=0; break;}
			}
			if(f!=0)
			{
				
				
			}

		}
	}
	
	
	
}
