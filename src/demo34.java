import java.util.*;
public class demo34{
    public static void main(String[] args){
	int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
	int l = oldArr.length;
	int l2 =0;
	for(int i=0;i<l;i++){
	    if(oldArr[i]!=0){
		l2+=1;
	    }
	}
	System.out.println(l2);
	int[] newArr= new int[l2];
	int count=0;
	for(int j=0;j<l;j++){
	    if(oldArr[j]!=0){
		newArr[count]=oldArr[j];
		count++;
	    }
	}
	System.out.println(Arrays.toString(newArr));
    }
}
