import java.util.*;
public class demo38{
   public static void main(String[] args){
	int[][] list={{5,6,1,16},{7,3,9}};
	int intArrs[]=new int[list.length];
	for(int x=0;x<list.length;x++){
	    intArrs[x]=list[x][0];
	}
	for(int i = 0;i<list.length;i++){
	    for(int j=0;j<list[i].length;j++){
		if(intArrs[i]>=list[i][j]){
		    intArrs[i]=list[i][j];
		}
	    }
	}
	System.out.println(Arrays.toString(intArrs));
   }
}
