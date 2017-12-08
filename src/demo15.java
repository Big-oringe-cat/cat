public class demo15{//拉二金字塔
    public static void main(String[] args){
	int line = 5;//指定金字塔高度
	for(int i=1;i<=line;i++){
	   //空格数
	    for(int j=1;j<i;j++){
	        System.out.print(" ");
	    }
	    //星星数
	    for(int k=(2*line-2*i+1);k>0;k--){
               System.out.print("*");
            }
	System.out.println();
	}
	for(int i=line-1;i>0;i--){
	    //空格数
            for(int j=i-1;j>0;j--){
                System.out.print(" ");
            }
            //星星数
            for(int k=1;k<=(line-i)*2+1;k++){
                System.out.print("*");
            }
	System.out.println();
	}
    }
}
