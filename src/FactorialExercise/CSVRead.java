package FactorialExercise;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;

public class CSVRead {
	 public static List<Integer> InputValues(){
		  List<Integer> result = new ArrayList<Integer>(); 
	      try {
	    	  CSVReader data = new CSVReader(new FileReader("/Users/PiotrM/workspace/csv/input.csv"), ',' , '"' , 0);
	    	  String[] nextLine;
	    	  //Read CSV line by line and use the string array as you want
	      while ((nextLine = data.readNext()) != null) {
	         if (nextLine != null) {
	            System.out.println(Arrays.toString(nextLine));
	            result.add(Integer.parseInt(nextLine[0]));
	         }
	      }
	      data.close();
	      }
	      catch(Exception e) {
	      }	      
	      return result;
	 }	      
}