/*有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问前12个月每个月的兔子总数为多少并输出前12个月每个月的兔子数量*/
import java.util.*;
public class demo16{
    public static void main(String[] args){
	int s1=1;
	int s2=1;
	int temp;
	Scanner input = new Scanner(System.in);
	System.out.println("你要看几月？");
	int month = input.nextInt();
	for(int i=1;i<=month;i++){//斐波拉切数列
	    if(i==1){
                System.out.println(i+"月的兔子总数为："+s1+"对");
            }else if(i==2){
                System.out.println(i+"月的兔子总数为："+s2+"对");
            }else if(i>=3){
		temp=s2;
		s2=s1+s2;
		s1=temp;
	        System.out.println(i+"月的兔子总数为："+s2+"对");
	    }
	}
    }
}
