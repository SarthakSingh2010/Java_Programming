package Myfilereadings;
import java.io.*;
public class ReadFromFile {
	  public static void main(String[] args)throws Exception
	  {
	  // We need to provide file path as the parameter:
	  // double backquote is to avoid compiler interpret words
	  // like \test as \t (ie. as a escape sequence)
	  File file = new File("G:\\first and second year.txt");
	  BufferedReader br = new BufferedReader(new FileReader(file));
	  String st;
	  while ((st = br.readLine()) != null)
	  {
		   String k[]=st.split(" ");
		  //String k =st.substring(st.lastIndexOf(' '));
		  //String k =st.substring(0,st.indexOf(' '));
		  //System.out.println(st.trim());
	  }
	  File file2 = new File("G:\\fifthsem.txt");
	  BufferedReader br2 = new BufferedReader(new FileReader(file2));
	  String st2;
	  while ((st2 = br2.readLine()) != null)
	  {
		   String k2[]=st2.split(" ");
		  //String k =st.substring(st.lastIndexOf(' '));
		  //String k =st.substring(0,st.indexOf(' '));
		  //System.out.println(st.trim());
	  }
	  br2.close();
	  br.close();
	  }
	}
