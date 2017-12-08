public class demo14{//拉二金字塔
    public static void main(String[] args){
	int line = 5;//指定金字塔高度
	for(int i=1;i<=line;i++){
	   //空格数
	    for(int j=1;j<=line-i;j++){
	        System.out.print(" ");
	    }
	    //星星数
	    for(int k=1;k<=(2*i-1);k++){
               System.out.print("*");
            }
	System.out.println();
	}
    }
}
