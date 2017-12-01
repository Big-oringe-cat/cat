public class demo27{
    public int max(int a,int b){
	int max=a>b?a:b;
	return max;
    }    
    public double max(double a,double b){
        double max=a>b?a:b;
	return max;
    }    
    public double max(double a,double b,double c){
        double max=a>b? a>c?a:c  :  b>c?b:c;
	return max;
    }    
    public static void main(String[] args){
        demo27 p1=new demo27();
	//int x=p1.max(3,5);
	//double y=p1.max(1.2,5.3);
	//double z=p1.max(5.3,3.6,9.1);
	System.out.println(p1.max(3,5));
	System.out.println(p1.max(1.2,5.3));
	System.out.println(p1.max(5.3,3.6,9.1));
    }
}
