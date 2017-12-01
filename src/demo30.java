public class demo30{
    public static void main(String[] args){
	for(int i=1;i<=4;i++){
	    for(int j=1;j<=4;j++){
	        for(int k=1;k<=4;k++){
		    int sum=100*i+10*j+k;
		    if(i!=j && i!=k && j!=k){
			System.out.println(sum);
		    }
		}
	    }
	}
    }
}
