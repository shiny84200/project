package highpeak1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Readfile1 {
	int b3,b4;
	String a;
	String b;
	public ArrayList list = new ArrayList();
	private Scanner x;
	
	public void openfile()
	{
		try
		{
			x=new Scanner(new File("C:\\Users\\dell\\eclipse-workspace\\highpeak1\\src\\highpeak1\\input1.txt"));
		}
		catch(Exception e)
		{
			System.out.println("could not find the file");
		}
		
	}
	
	
	public List<Item> readfile()
	{
		 String[] arr = new String[2]; 
		while(x.hasNext())
		{
			 a=x.next();
		     b=x.next();
		     
		     Item obj= new Item();
		     
		    obj.setItem(a);
		    obj.setPrice(b);
		    list.add(obj);
		 
		    		 
		}
		return list;
		

		
	}
	
	public int getMaxMinData(List<Item> item)
	{
		
		Item x=item.get(0);
	String x1=x.getPrice();
	int y=Integer.parseInt(x1); 
	String a1;
	String b1;

	int min;
	int  num;

    
    
	
	
	
	
	for (int i=1;i<=y;i++)
	{
	Item a=item.get(i);
		
		System.out.println(a.getItem()+a.getPrice());
	
	}
	for (int i=1;i<=y;i++)
	{
	Item a=item.get(i);
		a1=a.getItem();
		b1=a.getPrice();
	   b3=Integer.parseInt(b1);
	   b4=Integer.parseInt(b1);

	
	    for(int j=1;j<=y;j++)
	    {
	    	Item b=item.get(j);
	    	String b2=b.getPrice();
	    	int b33=Integer.parseInt(b2);
	    if(b33<b3)
	    {
	    int temp1=b33;
	    b33=b3;
	    b3=temp1;
	    } 
	    if(b33>b4)
	    {
	    	 int temp1=b33;
	 	    b33=b4;
	 	    b4=temp1;
	    }
	    }
	    
	
	   
	}
	 int ans=b3-b4;
	 return ans;
	}

	
	
	public void closefile()
	{
		x.close();
	}
	public void m1(int x)
	{
		
		
		Path path =Path.of("C:\\Users\\dell\\eclipse-workspace\\highpeak1\\src\\highpeak1\\output.txt");
		
		try {
			Files.writeString(path, "And the difference between the chosen goodie with highest price and the lowest price is "+x);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
