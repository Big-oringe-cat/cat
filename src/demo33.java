import java.util.*;
public class demo33{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("请输入一个字符：");
	char abc = input.next().charAt(0);
	int ascii = (int)abc;
	if(ascii >=65 && ascii <=90){
	    System.out.println("大写字母");	
	}else{
	    ascii -=32;
	    abc = (char)ascii;
	    System.out.println("大写字母:"+abc);
	}
    }
}
