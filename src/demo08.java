import java.util.*;
public class demo08{
    public static void main(String[] args){
	String result;
	Scanner out = new Scanner(System.in);
	System.out.println("请输入（100-1000）");
	int i = out.nextInt();
	result=i%2==1?"A":"B";
	System.out.println(result);
    }
}
