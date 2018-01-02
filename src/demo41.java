import java.util.*;
interface CompareObject{
    public void compareTo(ComparableCircle o);
}
class Circle{
    public String name;
    public int R;//半径
}
class ComparableCircle extends Circle implements CompareObject{
    public  ComparableCircle(int r,String name){
	this.name=name;
	this.R=r;
    }
    public void compareTo(ComparableCircle o){
	int result=this.R-o.R;
	if(result>0){
	    System.out.println(this.getClass().getName()+"大于"+o.name);
	}else if(result==0){
	    System.out.println(this.name+"等于"+o.name);
	}else{
	    System.out.println(this.name+"小于"+o.name);
	}
    }
}
public class demo41{
    public static void main(String[] args){
	ComparableCircle p1=new ComparableCircle(5,"p1");
	ComparableCircle p2=new ComparableCircle(3,"p2");
	p1.compareTo(p2);
    }
}
