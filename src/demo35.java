import java.lang.*;
public class demo35{
    public int x,y,r,w,h;
    public double area;
    public String type;
    public boolean result;
    public demo35(int x,int y, int r){//构建一个圆
	this.x=x;//定义圆心横坐标
	this.y=y;//圆心纵坐标
	this.r=r;//半径
	this.type="cycle";//类型为圆
        this.area=Math.PI*r*r;//面积
    }
    public demo35(int x,int y,int w,int h){//构建一个矩形
	this.x=x;//定义顶点（左下角）横坐标
	this.y=y;//顶点纵坐标
	this.w=w;//宽
	this.h=h;//高
	this.type="rectangle";//类型为矩形
	this.area=w*h;//面积
    }
    public double getarea(){//获得面积
	double area=this.area;
	return area;
    }
    public boolean contains(int x,int y){//判断(x,y)是否在图形内部
	boolean result;
	if(this.type=="cycle"){
	    this.result=Math.pow((Math.pow((this.x-x),2)+Math.pow((this.y-y),2)),1/2)<this.r?true:false;
	}else{
	    this.result=(x-this.x)>=0&&(x-this.x)<=this.w && (y-this.y)>=0&&(y-this.y)<=this.h?true:false;
	}
	return this.result;
    }
    public void in(){
	if(this.result){
	    System.out.println("点在图形内");
	}else{
	    System.out.println("点不在图形内");
	}
    }
    public static void main(String[] args){
	demo35 p1=new demo35(0,0,5);
	demo35 p2=new demo35(0,0,3,5);
	p1.getarea();
	p2.getarea();
	p1.contains(6,6);
	p2.contains(4,7);
	System.out.println("p1"+p1.type+"面积为"+p1.area);
	System.out.println("p2"+p2.type+"面积为"+p2.area);
	p1.in();
	p2.in();
    }
}
