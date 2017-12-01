public class demo02{
    public static void main(String[] args){
        int a = 3;
        int x = 100;
        if (a==1){
        	x+=5;
        }else if(a==2){
        	x+=10;
        }else if(a==3){
        	x+=16;
        }else if(a==4){
        	x+=34;
        }else{
        	x+=100;
        }
        System.out.println("x is "+x+", a is "+a);
    }
}
