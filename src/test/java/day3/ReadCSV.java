package day3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import au.com.bytecode.opencsv.CSVReader;

public class ReadCSV {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CSVReader csvReader = new CSVReader(new FileReader("src/test/resources/data/SuiteData1.csv"));
		String[] csvCell;
		while ((csvCell = csvReader.readNext()) != null) {
            String empid = csvCell[0];
            String name = csvCell[1];
            String email = csvCell[2];
		
           System.out.println(empid + " " + name +" " + email);
		}
	}
}

		
	


