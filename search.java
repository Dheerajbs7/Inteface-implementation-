import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

interface finds{
	void search();
}
public class result {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find obj=new find();
		obj.search();
	}
}
class find extends result implements finds{

	Scanner key= new Scanner(System.in);
	int i,n;
	int []arr=new int[20];
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements");
		n=key.nextInt();
		System.out.println("Enter the list of elements");
		for(i=0;i<n;i++)
		{
			arr[i] = key.nextInt();
		}		
		System.out.println("Enter the search method 1)linear 2)binary");
		int c=key.nextInt();
		if(c==1)
		{
			linear_search();
		}
		if(c==2)
		{
			binary_search();
		}
	}
	void linear_search()
	{
		System.out.println("Enter the key");
		int k=key.nextInt();
		int count=0;
		for(i=0;i<n;i++)
		{
			if(arr[i]==k)
			{
				System.out.println("Element found at position "+i);
				count++;
			}
			if(count>10)
			{
			System.out.println("Element not found ");
			}
		}
	}	
	void binary_search()
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int j=0;j<arr.length;j++)
		{
			a.add(arr[j]);
		}
		Collections.sort(a);
		for(int j=0;j<arr.length;j++)
		{
			arr[j]=a.get(j);
		}
		System.out.println("Enter the key");
		int k=key.nextInt();
		int mid,l,r;
		l=0;
	    r=n-1;
	    mid=(l+r)/2;

	      while(l<=r)
	      {
	         if (arr[mid]<k)
	           l=mid+1;
	         else if(arr[mid]==k )
	         {
	           System.out.println(k+" found at location "+(mid + 1));
	           break;
	         }
	         else
	         {
	             r=mid-1;
	         }
	         mid=(l + r)/2;
	      }
	      if ( l > r )
	          System.out.println(k+"is not found");
	}
}
	
