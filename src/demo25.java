public class demo25{
    public static void main(String[] args){
	int[] list ={23,454,645,76,867,26,756};
	int max = getMax(list);
	int min = getMin(list);
	System.out.println("max="+max);
	System.out.println("min="+min);
    }
    private static int getMax(int[] list){
        int max=list[0];
	for(int i=1;i<list.length;i++){
	    if(list[i]>max){
		max=list[i];
	    }
	}
	return max;
    }
    private static int getMin(int[] list){
        int min=list[0];
	for(int i=1;i<list.length;i++){
	    if(list[i]<min){
		min=list[i];
	    }
	}
	return min;
    }
}
