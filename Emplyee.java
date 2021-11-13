package Dev_TP1;
import java.io.*;

public class Emplyee implements Serializable
{
   public String name;
   public String address;
   public transient int SSN;
   public int number;
   public Emplyee(String name, String address, int SSN, int number){
	   this.name=name;
	   this.address=address;
	   this.SSN=SSN;
	   this.number=number;
   }
   public void mailCheck()
   {
      System.out.println("Mail de verification de " + name + " " + address);
   }
   void read(RandomAccessFile raf) throws IOException {
	    char[] temp = new char[15];
	    for (int i = 0; i < temp.length; i++)
	      temp[i] = raf.readChar();
	    name = new String(temp);
	    temp = new char[30];
	    for (int i = 0; i < temp.length; i++)
	      temp[i] = raf.readChar();

	    address = new String(temp);
	    SSN = raf.readByte();
	    number = raf.readByte();
	  }
   void write(RandomAccessFile raf) throws IOException {
	    StringBuffer sb;
	    if (name != null)
	      sb = new StringBuffer(name);
	    else
	      sb = new StringBuffer();

	    sb.setLength(15);
	    raf.writeChars(sb.toString());

	    if (address != null)
	      sb = new StringBuffer(address);
	    else
	      sb = new StringBuffer();

	    sb.setLength(30);
	    raf.writeChars(sb.toString());
	    raf.writeByte(SSN);
	    raf.writeDouble(number);
	  }
   
   String getName() {
	    return name;
	  }
   String getAddress() {
	    return address;
	  }
   int getSSN() {
	    return SSN;
	  }
   int getNumber() {
	    return number;
	  }
   


}
