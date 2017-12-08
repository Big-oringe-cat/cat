import java.util.*;
public class demo26{
    public static void main(String[] args){
	int[][] list = {{1,2,3},{4,5,6},{7,8,9}};
	showArrays(list);
	System.out.print("\n");
	changeArrays(list);
	showArrays(list);
    }
    public static void showArrays(int[][] list){
	for(int i=0;i<list.length;i++){
	    for(int j=0;j<list[i].length;j++){
	        System.out.print(list[i][j]+" ");
	    }
	    System.out.print("\n");
	}	
    }
    public static void changeArrays(int[][] list){
	int[][] temp = new int[list.length][list[0].length];
	for(int i=0;i<list.length;i++){
            for(int j=0;j<list[i].length;j++){
                temp[i][j]=list[i][j];
            }
	}
	for(int i=0;i<list.length;i++){
            for(int j=0;j<list[i].length;j++){
                list[j][i]=temp[i][j];
	    }
        }

    }
}
