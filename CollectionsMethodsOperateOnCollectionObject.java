package oopconcepts;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMethodsOperateOnCollectionObject {
    
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        
        a.add(10);
        a.add(5);
        a.add(20);
        System.out.println(a);
        
        System.out.println(Collections.max(a));
        System.out.println(Collections.min(a));
        
        Collections.sort(a);
        System.out.println(a);
        
        Collections.reverse(a);
        System.out.println(a);
        
        Collections.shuffle(a);
        System.out.println(a);
        
        Collections.swap(a, 1, 2);
        System.out.println(a);
        
        
    }

}


/**
 * Collections: The Collections class provides static methods that operate on or return Collection objects. It is part of the java.util package.

import java.util.Collections;


					ArrayList<Integer> list1 = new ArrayList<>();
        
        				list1.add(10);
				        list1.add(5);
				        list1.add(20);
				        System.out.println(list1);

					

Collections.method();
					.max(listName)
				       			 	System.out.println(Collections.max(list1));
					.min(listName)
			        				System.out.println(Collections.min(list1));
        				.sort(listName)
			        				Collections.sort(list1);
			        				System.out.println(list1);
        				.reverse(listName)
        							Collections.reverse(list1);
			        				System.out.println(list1);
        				.shuffle(listName)
        							Collections.shuffle(list1);
			        				System.out.println(list1);
        				.swap(listName)
        							Collections.swap(list1, 1, 2);
				       				 System.out.println(list1);
 */
