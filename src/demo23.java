import java.util.*;
public class demo23{
    public static void main(String[] args){
	for(int x=1;x<=1000;x++){
	    int num=x;
	    int sum=0;
	    int num_bak=num;
	    int list[] = new int[num];
	    int count=0;
	    for(int i=1;i<num_bak;i++){
	    	if(num%i==0){
	    	    list[count]=i;
	    	    count++;
	    	}else{
	    	    continue;
	        }
	    }
	    for(int i=0;i<list.length;i++){
	        sum+=list[i];
	    }
	    if(sum==num_bak){
	        System.out.println(num_bak);
	    }
	}
    }
}
