import java.util.*;
public class demo31{
    public static void main(String[] args){
	int year = 1992;
	int month=3;
	int day=17;
	int[] M={31,28,31,30,31,30,31,31,30,31,30,31};
	int sum =0;
	if(year%4==0){
	    M[1]=29;
	}
	for(int i=0;i<month-1;i++){
	    if(year%4==0 && i==1){
		sum+=29;
	    }else{
		sum+=M[i];
	    }
	}
	sum+=day;
	System.out.println(Arrays.toString(M));
	System.out.println(sum);
    }
}
