public class demo10{
    public static void main(String[] args){
	int n = 654,m = 1000;//实际消费与实际付款
	int l = m - n;//找零
	int q = l;
	if(l==0){
	    System.out.println("正好，不用找了。");
	}else if(l<0){
	    System.out.println("不好意思，钱不够。");
	}else{
	    int[] a = {100,50,20,10,5,1};//钞票金额
	    int[] b = new int[6];//对应钞票张数
	    for(int i = 1;i<=6;i++){
		if(l>=a[i-1]){
		    b[i-1]=l/a[i-1];
		    l=l%a[i-1];
		}	
	    }
	System.out.println("支付："+m);
	System.out.println("消费："+n);
	System.out.println("找零："+q);
	System.out.println("100元："+b[0]);
	System.out.println("50元："+b[1]);
	System.out.println("20元："+b[2]);
	System.out.println("10元："+b[3]);
	System.out.println("5元："+b[4]);
	System.out.println("1元："+b[5]);
	}
    }
}
