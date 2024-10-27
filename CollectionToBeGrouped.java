package oopconcepts;

import java.util.*;

public class CollectionToBeGrouped {

    public static void main(String[] args) {
        Collection<String> food = new ArrayList<>();
        food.add("Cabbage");
        food.add("Pizza");
        food.add("Sausage");
        food.add("Potatoes");
        food.add("Salad");
        System.out.println(food.contains("Cabbage"));
        food.remove("Cabbage");
        System.out.println(food);
    }

}

/*

Collection: 	A Collection is an interface allowing items to be grouped within a single container object. 
		It is found in the java.util package 
		It is implemented by List, Set, and Queue.
		import java.util;

		Collection<DataType> c = new CollectionClass<DataType>();


		Method			Syntax			Description
		.add()			.add(item)		Adds item to the collection if it wasn’t a member already.
		.addAll()		.addAll(collection)	Adds the elements in collection to the collection.
		.clear()		.clear()		Removes all the items in the collection.
		.contains()		.contains(item)		Returns true if item is a member of the collection.
		.containsAll()		.contains(collection)	Returns true if all the items in collection are contained in the collection.
		.isEmpty()		.isEmpty()		Returns true if the collection contains no elements.
		.remove()		.remove(item)		Removes item from the collection.
		.removeAll()		.removeAll(collection)	Removes all items in collection from the collection.
		.size()			.size()			Returns the number of elements in the collection.
		.toArray()		.toArray()		Returns an array containing all the elements in the collection.
		.toArray(array)					Returns an array whose data type is the same as array.

 */
