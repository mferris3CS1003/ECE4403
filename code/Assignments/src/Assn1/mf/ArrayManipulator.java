package Assn1.mf;
import java.util.*;
public class ArrayManipulator {
private int[] integers= new int[10];
public ArrayManipulator() {
	
	Random ran = new Random();
	for (int i=0; i< integers.length; i++) {
	 integers[i]=ran.nextInt(50);
	 
	}
	System.out.println(Arrays.toString(integers));;
	}
public int[] getEvenElements() {
	int counter=integers.length/2; 
	int[] newIntegers= new int[counter];
	//java rounds down hell yeah
	for (int i=0; i<integers.length; i+=2) {
	newIntegers[i/2]=integers[i];
	}
	
	return newIntegers;
}
public int[] getEvenIndices() {
	int counter=0; 
	
	//java rounds down hell yeah
	for (int i=0; i<integers.length; i+=1) {
	int var=integers[i];
	int temp =(var/2)*2;
	if(temp==var) {counter++;}
	
	}
	int[] newIntegers= new int[counter];
	//java rounds down hell yeah
	int secondCount=0;
	for (int i=0; i<integers.length; i+=1) {
	int var=integers[i];
	int temp =(var/2)*2;
	if(temp==var) {newIntegers[secondCount]=var;
	secondCount++;}
	
	}
	return newIntegers;
}
public int getFirst() {
 return integers[0];
}
public int getLast() {
	return integers[(integers.length-1)];
}
public void addFive() {
	int counter=integers.length/2; 
	
	//java rounds down hell yeah
	for (int i=0; i<integers.length; i+=1) {
	integers[i]=integers[i]+5;
	}
	
	}
public void sort() {
Arrays.sort(integers);}
public void reverse() {
	int[] newIntegers= new int[integers.length];
	for (int i=1; i<=integers.length; i+=1) {
		newIntegers[i]=integers[(integers.length-i)];}
		
	for (int i=0; i<integers.length; i+=1) {
		integers[i]=newIntegers[i];}
		
		
}
}


