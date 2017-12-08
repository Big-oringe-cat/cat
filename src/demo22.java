import java.util.*;
public class demo22{
    public static void main(String[] args){
	int num;
	System.out.print("请输入：");
	Scanner out=new Scanner(System.in);
	num = out.nextInt();
	int num_bak=num;
	int list[] = new int[num];
	int count=0;
	for(int i=1;i<=num_bak;i++){
	    for(int j=2;j<num_bak;j++){
		if(num%j==0){
		    list[count]=j;
		    count++;
		    num=num/j;
		    break;
		}else{
		    continue;
		}
	    }
	}
	//System.out.println(Arrays.toString(list));
	System.out.print(num_bak+"=");
	for(int i=0;i<=list.length-1;i++){
	    if(i==0){
	        System.out.print(list[i]);
	    }else if(list[i]!=0){
		System.out.print("*"+list[i]);
	    }
	}
	System.out.println("");
    }
}
