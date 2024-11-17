package com.arrayListAndLinkList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class ArrayListAndLinkList {
  public static void main(String args[]) {
	  
		/*
		 * ArrayList and LinkedList are two implementations of the List interface in the Java Collections Framework,
		 * but they have distinct differences in their
		 * underlying data structures and performance implications for various
		 * operations.
		 */ 
		/*
		 * ArrayList Underlying Data Structure: 
		 * 
		 * ArrayList uses a dynamic array to store
		 * its elements. This means that the elements are stored in contiguous memory
		 * locations. Performance: Random Access: Fast, as it provides O(1) time
		 * complexity for get and set operations due to direct indexing. Additions and
		 * Deletions: Can be slow, especially for operations at or near the beginning of
		 * the list, because it may require shifting elements to accommodate the new
		 * element or fill the gap left by a removed element. However, adding elements
		 * at the end of the list is generally fast unless the array needs to be
		 * resized. Memory Overhead: Less overhead per element, as it only needs space
		 * for the actual elements and doesn't store additional metadata for each
		 * element's linkage. 
		 *            LinkedList Underlying Data Structure: **************
		 *  LinkedList uses a doubly linked list to store its elements. Each element (node) in the list
		 * contains the data and a reference (link) to both the next and the previous
		 * node. Performance: Random Access: Slow, as it requires O(n) time complexity
		 * for get operations because it has to traverse the list from the beginning or
		 * end (whichever is closer) to access the desired element. Additions and
		 * Deletions: Fast, particularly when adding or removing elements from the
		 * beginning or end of the list, as it simply involves updating the link
		 * references without shifting any elements. Insertions or deletions at
		 * arbitrary positions require traversal but are still efficient once the
		 * position is reached. Memory Overhead: Higher overhead per element due to the
		 * storage of two additional references (next and previous) for each element.
		 * 
		 * 
		 * ArrayList is generally preferable when:
		 * 
		 * The list is mostly used for reading or randomly accessing elements.
         * You have a relatively stable list where frequent insertions and deletions are not expected.
         * 
         * LinkedList is more suitable when:
         * 
         * Your application requires frequent insertions and deletions from any part of the list.
         *  You need to frequently add or remove elements from the beginning or end of the list 
         *  (e.g., implementing stacks or queues).
		 * 
		 * 
		 */
	  ArrayList<String> arrayList=new ArrayList<>();
	  
	  arrayList.add("Kamlesh");
	  arrayList.add("Karthik");
	  arrayList.add("Shruti");
	  arrayList.add("Purnima");
	  
	  
	  LinkedList<String> linkedList=new LinkedList<>();
	  linkedList.add("Kamlesh");
	  linkedList.add("Karthik");
	  linkedList.add("Shruti");
	  linkedList.add("Purnima");
	  
	  linkedList.stream().forEach(s->System.out.println(s));
	  
	  System.out.println("FIletre The element Start with K letter");
	  
	  arrayList.stream().filter(a->a.startsWith("K")).collect(Collectors.toList()).forEach(s->System.out.println(s));
	  
  }
}
