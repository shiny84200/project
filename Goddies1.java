package highpeak1;

import java.util.List;

public class Goddies1 {

	
		public static void main(String[] args)
		{
			Readfile1 x=new Readfile1();
			x.openfile();
			
			List<Item> item =x.readfile();
			
			int answer=x.getMaxMinData(item);
			x.m1(answer);
		
			x.closefile();

					
			
		}
	}


