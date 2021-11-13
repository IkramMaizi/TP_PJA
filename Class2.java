package Dev_TP1;
import java.io.*;
import java.util.ArrayList;
public class Class2 {

	public static void main(String[] args) {
		ArrayList<Emplyee> empList = new ArrayList<Emplyee>();
		try
	      {
			 RandomAccessFile raf = new RandomAccessFile("empdirect.dat", "rw");
	         FileInputStream fileIn = new FileInputStream("emp.dat");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         
	         empList = (ArrayList<Emplyee>) in.readObject();
	        
	         in.close();
	         fileIn.close();
	         for(Emplyee e: empList){
	        	 e.write(raf);
	        	 /*System.out.println("Employee deserialise...");
	        	 System.out.println("Nom: " + e.name);
	        	 System.out.println("Adresse: " + e.address);
	        	 System.out.println("SSN: " + e.SSN);
	        	 System.out.println("Number: " + e.number);*/}
	         raf.close();
	      }catch(IOException i)
	      {
	    	  i.printStackTrace();
	          return;
	       }catch(ClassNotFoundException c)
	       {
	          System.out.println("classe Employee non trouvee");
	          c.printStackTrace();
	          return;
	       }
	
	      }


	}


