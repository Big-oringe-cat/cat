public class demo20{
    public static void main(String[] args){
	int line=5;
	for(int i=1;i<=line;i++){
	    for(int j=line;j>=i;j--){
	        System.out.print("+");
	    }
	    System.out.print("*");
	    for(int k=2*i-3;k>0;k--){
		System.out.print("-");
	    }
	    if(i>1){
		System.out.print("*");
	    }
	System.out.println("");
        }
	for(int i=1;i<line;i++){
            for(int j=0;j<=i;j++){
                System.out.print("+");
            }
            System.out.print("*");
            for(int k=1;k<=2*line-2*i-3;k++){
                System.out.print("-");
            }
            if(i<4){
                System.out.print("*");
            }
        System.out.println("");
        }

    }
}
