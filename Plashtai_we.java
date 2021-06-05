package Smetkata_na_Ivo;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Plashtai_we {

	public static Scanner user_input = new Scanner(System.in);

	public static void main(String[] args) {

		// String input = user_input.nextLine();

		int[] myArray1 = new int[12];
		int[] myArray2 = new int[12];
		int[] myArray3 = new int[12];
		int[] myArray4 = new int[12];
		int[] myArray5 = new int[12];
		int[] myArray6 = new int[12];

		arrayFiller(myArray1);
		bubbleSort(myArray1);
		
		arrayFiller(myArray2);
		bubbleSort(myArray2);
		
		arrayFiller(myArray3);
		bubbleSort(myArray3);
		
		arrayFiller(myArray4);
		bubbleSort(myArray4);
		
		arrayFiller(myArray5);
		bubbleSort(myArray5);
		
		arrayFiller(myArray6);
		bubbleSort(myArray6);

		System.out.println(Arrays.toString(myArray1));
		System.out.println(Arrays.toString(myArray2));
		System.out.println(Arrays.toString(myArray3));
		System.out.println(Arrays.toString(myArray4));
		System.out.println(Arrays.toString(myArray5));
		System.out.println(Arrays.toString(myArray6));

		try {
			FileWriter myWriter = new FileWriter("C:\\Users\\Tsu\\Desktop\\СМЕТКАТА.txt");
			myWriter.write("Сметката на Иво \n" );
			myWriter.write("First array: " + Arrays.toString(myArray1) + " Голд от началото на 2018 до края на 2018, общо:" + arrayCalculate(myArray1) + "\n");
			myWriter.write("Second array: " + Arrays.toString(myArray2) + "Голд от началото на 2019 до края на 2019, общо:" + arrayCalculate(myArray2) + "\n");
			myWriter.write("Third array: " + Arrays.toString(myArray3) + "Голд от началото и края на другата година, общо:" + arrayCalculate(myArray3) + "\n");
			myWriter.write("Fourth array: " + Arrays.toString(myArray4) + "Голд за всеки къснат килл, общо:" + arrayCalculate(myArray4) + "\n");
			myWriter.write("Fifth array: " + Arrays.toString(myArray5) + "Голд за всеки път когато си влязал в магазина без маска, общо:" + arrayCalculate(myArray5) +"\n");
			myWriter.write("Sixth array: " + Arrays.toString(myArray6) + "Голд за всеки път когато си бил мазен мангал в Лига, Майнкрафт, ЦСГО, реаллайф, с бабиера, общо:" + arrayCalculate(myArray6) + "\n");
			int result = arrayCalculate(myArray1)+arrayCalculate(myArray2)+arrayCalculate(myArray3)+arrayCalculate(myArray4)+arrayCalculate(myArray5)+arrayCalculate(myArray6);
			myWriter.write("Най-общо ми дължиш: " + result + " Голд");
			myWriter.close();
			
			System.out.println("Successfully wrote to the file.");

		} catch (Exception e) {
			System.out.println("Ahhh, sheesh an error");
			e.printStackTrace();
		}

	}

	public static void arrayFiller(int[] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = (int) (Math.random() * 90000);
		}
	}

	public static void bubbleSort(int[] myArray) {
		int n = myArray.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if(myArray[j] > myArray[j+1]) {
					
					//swap
					int temp = myArray[j];
					myArray[j] = myArray[j+1];
					myArray[j+1] = temp;
				}
			}
		}
	}
	
	public static int arrayCalculate(int[] myArray) {
		int result = 0;
		for(int i = 0; i < myArray.length-1; i++) {
			result += myArray[i] + myArray[i+1];
		}
		return result;
	}

}
