package Week3Day2Assignments;

import java.util.ArrayList;

import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] a={3,2,11,4,6,7};
     int[] b={1,2,8,4,9,7};
   
   
     List<Integer> list1 = new ArrayList<Integer>();
     List<Integer> list2= new ArrayList<Integer>();
     List<Integer> list3=new ArrayList<Integer>();
     
     
     for( int i=0;i<a.length;i++)
     {
    	 list1.add(a[i]);
    	 
     }
     //System.out.println(list1);
    
     for(int j=0;j<b.length;j++)
     {
    	 list2.add(b[j]);
     }
     
     for(int x=0;x<list1.size();x++)
     {
    	 for(int y=0;y<list2.size();y++)
    	 {
    	   
    		  if(a[x]==b[y])
    		  {
    			  list3.add(a[x]);
    		  }
    	 }
    	
     }
     System.out.println(list3);
	}

}
