package Utility;

public class test {
	
	public static void main(String[] args) throws Exception
	{
		String string="((p||q)&&(p||q)))";
		System.out.println(utility.Extract(string, '(', 0));
		char Rcondition='(';
		char Lcondition=')';
		int rcount=1;
		int lcount=0;
		int i;
		System.out.println("Length is:"+string.length());
		for( i=1;i<string.length();i++)
		{
			 if(rcount==lcount)
					break;
			 
			if(string.charAt(i)==Rcondition){
				rcount++;
				continue;
			}
			if(string.charAt(i)==Lcondition){
				lcount++;
				continue;
			}
		}
		System.out.println("Location is:"+(i+1));
		System.out.println("Extract Result is:"+string.substring(0, i));
		
		
	}

}
