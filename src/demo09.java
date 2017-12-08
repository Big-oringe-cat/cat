import java.util.*;
public class demo09{
    public static void main(String[] args){
        int sum = 0;
	int size = 3;
	Scanner out = new Scanner(System.in);
	int[] score = new int[size];
	String[] level = new String[size];
	String[] kemu = new String[size];
	kemu[0]="语文";
	kemu[1]="英语";
	kemu[2]="数学";
	for(int i =1;i<=size;i++){
	    System.out.println(String.format("请输入%s成绩：",kemu[i-1]));
	    score[i-1]=out.nextInt();
	    level[i-1]=score[i-1]>=70?"忧":score[i-1]>=60?"一般":"不及格";
	    sum += score[i-1];
	}
	System.out.println(String.format("总成绩为:%d",sum));
	System.out.println(String.format("平均成绩为:%d",sum/3));
	for(int i = 1;i<=3;i++){
	    System.out.println(String.format("%1$s是%2$s",kemu[i-1],level[i-1]));
	}	
    }
}
