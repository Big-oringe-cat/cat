import java.util.*;
public class demo18{
    public static void main(String[] args){
        int[] array1={2,3,5,7,11,13,17,19};
	int[] array2=new int[8];
	System.out.println(Arrays.toString(array1));
	array2=array1;
	for(int i=0;i<8;i+=2){
	    array2[i]=i;
	}
	System.out.println(Arrays.toString(array2));
    }
}
