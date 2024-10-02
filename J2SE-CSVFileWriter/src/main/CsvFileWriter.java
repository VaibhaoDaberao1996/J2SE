package main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvFileWriter {

	public static void main(String[] args) {
		
		String path ="D:\\CsvFileWriter.csv";
		
		List<String> columnName =Arrays.asList("ID","Name","Email");
		
		List<List<String>> rows = new ArrayList<List<String>>();
		rows.add(Arrays.asList("1","vaibhao","vaibhao@gmail.com"));
		rows.add(Arrays.asList("2","shubham","shubham@gmail.com"));
		rows.add(Arrays.asList("3","rupesh","rupesh@gmail.com"));
		
		writeLine(columnName);
		for(List<String> row : rows) {
			writeLine(row);
	}
		
		/* below is try with reosurce block
		 * we do not need to provide finally block
		 * cause resource(writer) will close automatically */
//		try(FileWriter writer = new FileWriter(path)){
//			
//			writeLine(writer, columnName);
//			
//			for(List<String> row : rows) {
//				writeLine(writer, row);
//			}
//			
//			System.out.println("File is created succesfully");
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		
	}
	
	private static void writeLine(List<String> values) {
		String line = String.join(",", values);
		System.out.println(line);
//		writer.write(line + "\n");
	}
}
