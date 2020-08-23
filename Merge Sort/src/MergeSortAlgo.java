
public class MergeSortAlgo {

	public void Merge(int [] a,int [] b,int [] c)
	{
		int aindex=0,bindex=0,cindex=0;
	while(aindex<a.length&&bindex<b.length)	
		{
		if(a[aindex]>b[bindex])
		
			c[cindex++]=b[bindex++];
		else
			c[cindex++]=a[aindex++];
	    }
	while(aindex<a.length)
		c[cindex++]=a[aindex++];
	while(bindex<b.length)
		c[cindex++]=b[bindex++];				
	}
	
	public void  MergeSort(int [] list)
	{
		if(list.length>1)
		{int [] lefthalf=new int [list.length/2];
		System.arraycopy(list, 0, lefthalf, 0, lefthalf.length);
		MergeSort(lefthalf);
	//	System.out.println("first: ");
	//	display(lefthalf);
		int rightlen=list.length-lefthalf.length;
		int [] righthalf=new int [rightlen]	;	
		System.arraycopy(list, lefthalf.length, righthalf, 0, rightlen);
		MergeSort(righthalf);
	//	System.out.println("second: ");
	//	display(lefthalf);
		Merge(lefthalf,righthalf,list);
	    }
	}
	public void display(int[]list)
	{
		for(int i=0;i<list.length;i++)
			System.out.print(list[i]+" ");
		System.out.println(" ");
	}
	
}
