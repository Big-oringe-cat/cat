import java.util.*;
public class demo37{
    public static void main(String[] args){
	System.out.println("请输入一个数字");
	Scanner input=new Scanner(System.in);
	int num = input.nextInt();
	while(num!=1){
	    num=num%2==1?num*3+1:num/2;
	    System.out.println(num);
	}
    }
}
