public class demo29{
    public double height;
    public double times;
    double[] result=new double[2];
    public demo29(double height,double times){
	this.height=height;
	this.times=times;
    }
    public  double[] jump(double height,double times){
	double sum=0;
	double down;
	double up;
	//double[] result=new double[2];
	for(double i=1;i<=times;i++){
	    down=height;
	    up=down/2;
	    sum=sum+(down+up);
	    height=height/2;
	}
	result[0]=sum;
	result[1]=height;
	return result;
    }
    public static void main(String[] args){
	demo29 p1=new demo29(100,10);
	p1.jump(p1.height,p1.times);
	System.out.println(p1.height+" "+p1.times);
	System.out.println(p1.result[0]+" "+p1.result[1]);
	//System.out.prdoubleln(p1.result[0]+" "+p1.result[1]);
    }
}
