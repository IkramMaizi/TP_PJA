package Dev_TP1;

import java.util.ArrayList;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.util.Scanner;


public class Class3 {

	public static void main(String[] args)  {
		
		try{
			RandomAccessFile raf = new RandomAccessFile("empdirect.dat", "rw");
			try{
				Scanner input = new Scanner(System.in);
			int nbr= input.nextInt();
			while(true){
			Emplyee e= new Emplyee("","",0,0);
			e.read(raf);
			if(e.number==nbr){
			System.out.println("Nom: " + e.name);
			System.out.println("Adresse: " + e.address);
			System.out.println("SSN: " + e.SSN);
			System.out.println("Number: " + e.number);}}}
			catch(EOFException e){
				System.out.println(e);
			}
			
		}catch(IOException i)
	      {
	    	  i.printStackTrace();
	       }

	}

}
