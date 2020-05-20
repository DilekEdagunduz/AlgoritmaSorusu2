
package alg_soru;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Alg_soru {
    private static int[] selectionSort(int [] arr)
{
    int temp;
    int enKucuk;
    int n;
    int dizi;
    for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
}
    public static void main(String[] args) {
        System.out.println("sıralama algoritması");
        int [] unorderedList ={12,36,56,24};
        int [] orderedList = selectionSort(unorderedList);
   
        int a=0;
       for (int i : orderedList){
            System.out.println(i);
        }
        System.out.println("Bütün elemanların toplamı ");
          for (int i : unorderedList){
                    
                  a=a+i;
                  
        } 
                   System.out.println(a);
                   System.out.println("Ortalama");
                   System.out.println(ortalama(unorderedList));
    }
   
    public static double ortalama (int[] unorderedList)
    {
        int ortalama =0;
        for (int i=0; i< unorderedList.length; i ++ )
        {
            ortalama = ortalama +unorderedList[i];
        }
        ortalama =ortalama /unorderedList.length;
        return (double) ortalama;
    }
    }
    

