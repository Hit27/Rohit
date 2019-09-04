

public class Cupon
{
	public static void main(String[] args) 
	{
		char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
	
		
		int max=100000000;
		System.out.println(max);
		int random=(int) (Math.random()*max) ;	
		int rand=(int) (Math.random()*max);
		System.out.println(rand+" "+random);
		StringBuffer sb=new StringBuffer();
		
		while (random>0)
		{
			sb.append(chars[random % chars.length]);
			random /= chars.length;
		}

		
		System.out.println("Coupon Code: "+sb);	
	}
} 
