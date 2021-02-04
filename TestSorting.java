

import java.io.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestSorting {

	public static void main(String[] args) throws IOException{


		int[] array100 = new int[100];
		int[] array1000 = new int[1000];
		int[] array5000 = new int[5000];



		Random rand = new Random();
		int random = rand.nextInt(500);

		for(int i=0; i<100; i++){
	//		array5000[i] = rand.nextInt(5000);
	//		array5000[i] = i;
	//		array5000[i] = 5000-i;

	//		array1000[i] = rand.nextInt(5000);
	//		array1000[i] = i;
	//		array1000[i] = 1000-i;

	//		array100[i] = rand.nextInt(5000);
			array100[i] = i;
	//		array100[i] = 100-i;



		}


		long startTimee = System.nanoTime();
		long startTime = System.currentTimeMillis();

		System.out.print("Current Time in nanoseconds at start = ");
		System.out.println(startTimee);

		System.out.print("Current Time in milliseconds at start = ");
		System.out.println(startTime);


	//	InsertionSort object = new InsertionSort();
	//	array100 = object.insertionSort(array100);//random

	//	MergeSort sortObj = new MergeSort(array5000);//random
	//	sortObj.sort();

	//	HeapSort ob = new HeapSort();
	//	ob.printArray(ob.sort(array5000));
	//	ob.sort(array100);//best

		QuickSort qsobj = new QuickSort(array100);//best
		qsobj.sort();
	//	qsobj.printArray();


		long finishTimee = System.nanoTime();
		long finishTime = System.currentTimeMillis();


		System.out.print("Current Time in milliseconds at finish = ");
		System.out.println(finishTime);

		System.out.print("Current Time in nanoseconds at finish = ");
		System.out.println(finishTimee);

		long elapsedTime = finishTime - startTime;
		long elapsedTimee = finishTimee - startTimee;

		System.out.println("\nTotal execution time to sort in milliseconds: " + elapsedTime);
		System.out.println("Total execution time to sort in nanoseconds: " + elapsedTimee);


	}
}

