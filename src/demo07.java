import java.util.*;
public class demo07{
    public static void main(String[] args){
	int a = 0;//正
	int b = 0;//负
        int i = 0;
        do{
	    Scanner out = new Scanner(System.in);
	    System.out.println("please input your number:");
	    i = out.nextInt();
	    if(i>0){
		a +=1;
	    }else if(i<0){
	        b +=1;
    	    }
	}while(i!=0);
	System.out.println("正数有"+a+"个");
	System.out.println("负数有"+b+"个");
    }
}
