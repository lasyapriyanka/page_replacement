package page;
import java.io.*;
import java.util.Scanner;

public class main_class {

		
		  public static void main(String args[])throws IOException
		   {
		    BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		   int f,page=0,ch,pgf=0,n,chn=0;
		boolean flag;
			int pages[],frame[]; 		//pgf-page fault
		do{
			System.out.println("Menu");
			System.out.println("1.FIFO");
			System.out.println("2.LRU");
			System.out.println("3.LFU");
			System.out.println("4.EXIT");
			System.out.println("ENTER YOUR CHOICE: ");
			 ch=Integer.parseInt(obj.readLine());
			// BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("enter no. of frames: ");
				f=Integer.parseInt(obj.readLine());
				frame=new int[f];
				System.out.println("enter the no of pages ");
				 n=Integer.parseInt(obj.readLine());
				 pages=new int[n];
				 System.out.println("enter the page no ");
				 for(int j=0;j<n;j++)
				 pages[j]=Integer.parseInt(obj.readLine());


			switch(ch)
			{
			case 1:
				fifo example=new fifo(f,n,pages);
				example.set_values();
			//case 2:
				//lru example=new lru(f,n);
			//case 3:
				//lfu example=new lfu(f,n);
			case 2:
				break;
			}
				// TODO Auto-generated method stub

	}while(ch!=4);
		   }
}

		
