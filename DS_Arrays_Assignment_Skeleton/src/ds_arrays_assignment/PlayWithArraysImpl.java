package ds_arrays_assignment;

import ds_arrays.MyArrayIF;
import ds_arrays.MyUnorderedArray;


public class PlayWithArraysImpl<E extends Comparable<E>> implements PlayWithArraysIF<E> {
    
    public PlayWithArraysImpl() {
    }

    @Override
    public int findSize(MyArrayIF<E> a) // O(n)
    {
        int i=0;
        try{
    
            

            //a.getElementAt(i);
            while(a.getElementAt(i)!=null)
            {
                i++;
            }

    }catch(IndexOutOfBoundsException E){}
        return i;
    }
    

    @Override
    public E findLargestValue(MyArrayIF<E> a) { //O(N)
        E temp=a.getElementAt(0);
        try{
            int i=1;

            while(a.getElementAt(i)!=null)
            {
               if(a.getElementAt(i).compareTo(temp)>0)
               {
                   temp=a.getElementAt(i);
               }
               i++;

            }
        }catch(IndexOutOfBoundsException E){}
            return temp;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override 
    public E findSecondLargestValue(MyArrayIF<E> a)// 2(N)-> O(N)
    {
        E temp=a.getElementAt(0);
        E temp2=a.getElementAt(0);
        try{
    
        int i=1;
        int f=1;
        
        E r=this.findLargestValue(a);
        while(a.getElementAt(f)!=null)
        {
            if((a.getElementAt(f).compareTo(temp2)>0)&&(a.getElementAt(f).compareTo(r)<0))
            {
                temp2=a.getElementAt(f);
            }
            f++;
        }
//           if(a.getElementAt(i).compareTo(temp2)>0)
//           {
//               temp2=a.getElementAt(i);
//           }
//           i++;
//           return temp2;
//        }
//        
//        while(a.getElementAt(f)!=null)
//        {
//            if((a.getElementAt(f).compareTo(temp)>0) && a.getElementAt(f).compareTo(temp2)<0)
//                temp=a.getElementAt(f);
//            f++;
//        }
        
    }catch(IndexOutOfBoundsException E){}
        return temp2;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override  
    public MyArrayIF<E> intersect(MyArrayIF<E> a1, MyArrayIF<E> a2, MyArrayIF<E> a3) {
       try{
        int n1=this.findSize(a1);
        int n2=this.findSize(a2);
        int n3=this.findSize(a3);

        //int n4=0;
        //MyArrayIF<E> a4;
        for(int i=0; i<=n1; i++) // iterating through Array 1
        {
           if(a2.find(a1.getElementAt(i))!=-1 && a3.find(a1.getElementAt(i))!=-1)
           {
               
           }
            else{
                a1.delete(a1.getElementAt(i));
                i--;
            }
        }
    }catch(IndexOutOfBoundsException E){}
        return a1;
//throw new UnsupportedOperationException("Not supported yet.");
    }



}
