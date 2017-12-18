import java.util.*;
public class demo39{
    public String type;
    public String color;
    public int wheel_num;
    public int weight;
    public int people;
    public String energy;
    public void set(String type,String color,int wheel_num,int weight,int people,String energy){
	this.type=type;
	this.color=color;
	this.wheel_num=wheel_num;
	this.weight=weight;
	this.people=people;
	this.energy=energy;
    }
    public void show(){
	System.out.println("颜色："+this.color);
	System.out.println("轮子："+this.wheel_num);
	System.out.println("重量："+this.weight+"kg");
	System.out.println("限定人数："+this.people);
	System.out.println("能源类型："+this.energy);
    }
    public static void main(String[] args){
	transform p1= new transform();
	transform p2= new transform();
	transform p3= new transform();
	p1.set("car","red",4,1500,5,"oil");
	p2.set("三轮","blue",3,200,3,"electry");
	p3.set("自行车","black",2,20,1,"hunman power");
    
    System.out.println("你要什么车？");
    Scanner answer=new Scanner(System.in);
    String car=answer.next();
    switch(car){
	case "car":
	    p1.show();
	    break;
	case "三轮":
	    p2.show();
	    break;
	case "自行车":
	    p3.show();
	    break;
	default:
	    System.out.println("不好意思，没这车。");
	    break;
    }
    }
}
