public class demo28{
    String name;
    int age;
    String school;
    String sex;
    public demo28(String n,int a){
	this.name=n;
	this.age=a;
    }
    public demo28(String n,int a,String s){
	this.name=n;
	this.age=a;
	this.school=s;
    }
    public demo28(String n,int a,String s,String m){
	this.name=n;
	this.age=a;
	this.school=s;
	this.sex=m;
    }
    public static void main(String[] args){
	demo28 p1=new demo28("jake",18);
	demo28 p2=new demo28("jake",18,"清华");
	demo28 p3=new demo28("jake",18,"蓝翔","男");
	System.out.println(p1.name+","+p1.age);
	System.out.println(p2.name+","+p2.age+","+p2.school);
	System.out.println(p3.name+","+p3.age+","+p3.school+","+p3.sex);
    }
}
