public class Palindrome {

	public boolean isPalindrome(int val){
		double count=0;
		int temp,yeni=0;
		temp=val;
		while(val!=0)
		{
			val=val/10;
			count++;
		}
		val=temp;
		double num=count;
		for(int i=0 ; i<num ;i++)
		{
			double k= val%10;
			val=val/10;
			yeni=(int)(yeni+(k*(Math.pow(10.0,count))));
			count--;
		}
		if(yeni==temp)
			return true ;
		return false;
	}

}