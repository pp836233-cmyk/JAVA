import java.util.*;
public class arraylist
{
    public static void main(String[] args)
{
ArrayList<String> arrayList=new ArrayList<>();
arrayList.add( "vibgiyor");
arrayList.add( "indigo");
arrayList.add( "vilote");
arrayList.add( "green");

System.out.println("First element is "+arrayList.get(0));
System.out.println("The elements of the arraylist is - "+arrayList);
Collections.sort(arrayList);
System.out.println("\nThen ArrayList Sortted :"+arrayList);
Collections.addAll(arrayList,"red","blue","orange","yellow");
System.out.println("\nAdding new items in the arraylist is :"+arrayList);
Collections.sort(arrayList,Collections.reverseOrder());
       System.out.println("\nThe reverse order of the arraylist:"+arrayList);
System.out.println("\nThe maximum element of the arraylist : "+Collections.max(arrayList));
for(String word: arrayList)
     {
        System.out.println(word);
 }
} }