import java.util.*;
public class demo13{
    public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("请输入第一个数：");
	int a = input.nextInt();
	System.out.println("请输入第二个数：");
	int b = input.nextInt();
	int i=(a>=b)?a:b;
        int gongyue=0;
        int gongbei=0;
	for(;i>0;i--){
	    if(a%i==0 && b%i==0){
	        gongyue=i;
                break;
            }
	}
	gongbei=a*b/gongyue;
	System.out.println("最大公约数："+gongyue);
	System.out.println("最小公倍数："+gongbei);
    }
}
