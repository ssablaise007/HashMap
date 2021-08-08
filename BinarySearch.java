package searchingalgorithms;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) throws IOException {
	//Get the words list from the file
	String[] words = getWordsListFromFile(args[0]);
	//Sort the list using Arrays sort method
	Arrays.sort(words);
	//Display After Sorting
	Utility.display(words, "After Sorting");
	//Read the word to be searched from the user
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the word to be searched..");
	String word = scanner.next();

	//Apply Binary Search
	int index = binarySearch(words, word);

	//Check word found or not
	if(index >= 0) {
	System.out.println("Word found at position  " + index);
	}else {
	System.out.println("Word not found.");
	}
	scanner.close();
	}
	
	private static int binarySearch(String[] words, String word) {
	int l = 0, r = words.length - 1;
	        while (l <= r) {
	            int m = l + (r - l) / 2;
	            int res = word.compareTo(words[m]);
	            // Check if x is present at mid
	            if (res == 0)
	                return m;
	            // If x greater, ignore left half
	            if (res > 0)
	                l = m + 1;
	            // If x is smaller, ignore right half
	            else
	                r = m - 1;
	            }
	        return -1;
	        }
	private static String[] getWordsListFromFile(String filePath) throws IOException {
		String content = new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);
		return content.split(",");
		}
	}
