# Java_DSA
Array:-
	Array is a data structure that stores multiple values of the same type in a single variable. It allows you to group related data together. When you declare an array, contiguous memory is allocated for its elements. Here are some key points about array memory allocation in Java:
		1. Array Base Address:
			○ The address of the first array element is called the array base address.
			○ Each element occupies memory space based on its data type (e.g., 1, 4, or 8 bytes for different types).
			○ The next memory address is assigned to the subsequent element in the array.
			○ This process continues until all array elements are allocated
		2. Heap Allocation:
			○ Memory for arrays is allocated in the heap area.
			○ The heap is where Java objects (including arrays) are stored.
			○ Arrays are reference types, so they are also stored in the heap.
			○ When you create an array using the new keyword, memory is allocated in the heap, and a reference to the array is returned1.
		3. Contiguous Storage:
			○ Arrays in Java are stored in contiguous memory locations.
			○ Elements are stored one after the other in memory.
			○ The first element has the lowest memory address, and the last element has the highest address2.
	Remember that arrays can store either primitive values (like int, char, etc.) or references (pointers) to objects. For 
	
	Example:
	// Creating an array of integers
int[] intArray = new int[5]; // Allocates memory for 5 integers and by default the value is 0
	// Creating an array of objects (references)
String[] stringArray = new String[10]; // Allocates memory for 10 String references
	
	
	
![Uploading image.png…]()
