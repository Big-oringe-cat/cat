import java.util.*;
public class demo17{
    public static void main(String[] args){
	char list[]={'a','d','e','t','y','b','q'};
	Arrays.sort(list);
	for(int i = list.length-1;i>=0;i--){
	    System.out.println(list[i]);
	}
    }
}
