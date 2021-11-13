package Dev_TP1;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		{
			int nbr;
			
			Scanner input = new Scanner(System.in);
			Scanner s_input = new Scanner(System.in);
			System.out.println("entrez le nombre d’objets à sérialiser");
		    nbr= input.nextInt();
		    ArrayList<Emplyee> empList = new ArrayList<Emplyee>();
			for (int i = 0; i < nbr; i++) {
				try{
					System.out.println("entrez le nom de l'employee numero " +(i+1));
					String name= s_input.next();
					System.out.println("entrez l address de l'employee numero " +(i+1));
					String address= s_input.next();
					System.out.println("entrez le SSN de l'employee numero:" +(i+1));
					int SSN= input.nextInt();
					System.out.println("entrez le numero de l'employee numero " +(i+1));
					int numero= input.nextInt();
					empList.add(i,new Emplyee(name, address, SSN, numero));

				}
				catch(NullPointerException e) {
					System.out.println(e);
				}
			}
		      try
		      {
		         FileOutputStream fileOut = new FileOutputStream("emp.dat");
		         ObjectOutputStream out = new ObjectOutputStream(fileOut);
		         for (int i = 0; i < nbr; i++){
		         out.writeObject(empList);
		         }
		         out.close();
		         fileOut.close();
		         System.out.printf("donnees serialisees sauvegardees dans emp.dat");
		      }catch(IOException i)
		      {
		          i.printStackTrace();
		      }


	}

}
}
