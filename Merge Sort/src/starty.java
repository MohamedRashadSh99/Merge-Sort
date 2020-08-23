public class starty {
    public static void main(String[] args) {

    	MergeSortAlgo merge=new MergeSortAlgo();
      //merge sort
        int [] a1= {100,21,4,3,2,44,233,1};
        merge.MergeSort(a1);
        for(int i=0;i<a1.length;i++)
        	System.out.print(a1[i]+" ");
    }

    

    
}
