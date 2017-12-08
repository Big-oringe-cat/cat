public class demo32{
    public static void main(String[] args){
	int[] list={10000,1000,100,10,1};//截取每一位数字
	int bak;
	for(int i=10000;i<100000;i++){
	    bak=i;
	    int[] num= new int[5];//接收每一位数字
	    //System.out.println(i);
	    for(int j=0;j<5;j++){
		num[j]=bak/list[j];
		bak=bak-list[j]*num[j];
	    }
	    if(num[0]==num[4]&&num[1]==num[3]){
		System.out.println(i);
	    }
	}
    }
}
