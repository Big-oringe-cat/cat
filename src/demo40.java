class goWest{
    public int height;
    public String name;
    public String weapon;
    public void printName(){
	System.out.print("名字："+name+" ");
    }
    public void printWeapon(){
        System.out.println("必杀："+weapon);
    }
}
public class demo40{
    public static void main(String[] args){
	goWest p1=new goWest();
	p1.name="孙悟空";
	p1.weapon="龟派气功";
	p1.printName();
	p1.printWeapon();
	goWest p2=new goWest();
        p2.name="贝吉塔";
        p2.weapon="终极闪光";
	p2.printName();
        p2.printWeapon();

    }
}
