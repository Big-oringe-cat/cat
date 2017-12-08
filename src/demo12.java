import java.util.*;
public class demo12{
    public static void main(String[] args){
	Scanner out = new Scanner(System.in);
	System.out.println("请输入一个五位数");
	int num = out.nextInt();
	if(num<100000 && num>9999){
	    int num_bak= num;
	    int s = 0;//奇数
	    int d = 0;//偶数
	    int[] zero ={10000,1000,100,10,1};
	    int[] nl= new int[5];//用来接收每一位的数字
	    for(int i=0;i<5;i++){
		nl[i]=num/zero[i];//截取每一位数字
		num=num-nl[i]*zero[i];
		if(nl[i]/2==1){
		    s++;
		}else{
		    d++;
		}
	    }
	    System.out.println("五位数："+num_bak);
	    System.out.println("奇数："+s);
	    System.out.println("偶数："+d);
	}else{
	    System.out.println("您输入的不是五位数！！！");
	}
    }
}
