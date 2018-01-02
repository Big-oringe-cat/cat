import java.util.*;
public class Bank{
    public String account;//账户
    public String passwd;//密码
    public int balance;//余额
    public static double rate=0.003;//利率
    public static int last=10;//最小余额
    public static String input(String word){
	System.out.println(word);
	Scanner input=new Scanner(System.in);
        String result=input.next();
	return result;
    }
    public static int inputInt(String word){
	System.out.println(word);
	Scanner input=new Scanner(System.in);
        int result=input.nextInt();
	return result;
    }
    public static double inputDouble(String word){
	System.out.println(word);
	Scanner input=new Scanner(System.in);
        double result=input.nextDouble();
	return result;
    }
    public void setAccount(String account){
	System.out.println("欢迎您在我行开户");
	this.account=account;
	this.passwd=Bank.input("请设置您的密码");
	this.balance=Bank.inputInt("您先充点钱吧");
	this.rate=Bank.rate;
	this.last=Bank.last;
    }
    public void showAccount(){
	System.out.println("尊敬的用户"+this.account+"，您好：");
	System.out.println("您当前的密码是："+passwd);
	System.out.println("您的余额为："+balance);
	System.out.println("我行当前利率为："+rate);
	System.out.println("我行的最小余额为："+last);
    }
    public static void main(String[] args){
	String[] name={"saber","lancer","archer"};
	for(int i=0;i<name.length;i++){
	    Bank p=new Bank();
            p.setAccount(name[i]);
            p.showAccount();
	}
    }
}
