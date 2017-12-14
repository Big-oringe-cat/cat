public class demo36{
    public static void main(String[] args){
        int money=100;
	int x,y,z;//分别为公鸡，母鸡，小鸡数量
	int count=0;
	for(x=0;x<=money/5;x++){
	    for(y=0;y<=money/3;y++){
		z=money-x-y;
		if(z==0 || z%3==0 && (5*x+3*y+z/3)==money){
		    count+=1;
		    System.out.println(String.format("公鸡：%1$d,母鸡：%2$d,小鸡：%3$d",x,y,z));
		}
	    }
	}
	System.out.println(String.format("一共有%d种买法",count));
    }
}
