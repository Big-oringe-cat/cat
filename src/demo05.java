public class demo05{
    public static void main(String[] args){
	int sum = 0;
	for(int i = 1;i<100;i++){//循环体
	// 被3整除的都加到sum里
	    if(i%3==0){
		sum += i;
	    }
	}
	System.out.println("sum is "+sum);
    }
}
