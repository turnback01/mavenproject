package day10;

import java.io.FileReader;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class CSVReading{
  @Test
  public void f() throws Exception 
  {
	  CSVReader csv=new CSVReader(new FileReader("D:\\logindata.csv"));
	  String data[]=csv.readNext();
	  for(String dt:data)
	  {
		  System.out.println(dt);
	  }
	  
	  List<String[]> li=csv.readAll();
	  for(String l[]:li)
	  {
		  for(String dat:l)
		  {
			  System.out.println(dat);
		  }
		 
	  }
  }
}
