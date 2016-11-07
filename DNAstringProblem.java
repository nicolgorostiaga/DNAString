import java.io.*;
import java.util.*;

public class DNAFile{

	private Scanner content;
	private int n1,n2,n3,n4 = 0;
	
	public void openDNAFile(){
		try{
			content = new Scanner(new File("DNA.txt"));
			// open and read file
		}
		catch(Exception e){
			System.out.println("Could not find your file."
		}
	}// end openDNAFile method
	public void readDNAFile(){
		String file = content.next();
		//store string in variable file
		char letter[] = file.toCharArray();
		//string to character array
		int length = file.length();
		// how many character in file to determine end of file
		for(int i = 0; i < length; i++){
			char c = letter[i];// stores each nucleotide to var. c
			switch(c){
				case 'A': n1++;
					break;
				case 'C': n2++;
					break;
				case 'G': n3++;
					break;
				case 'T': n4++;
					break;
			}// end switch - keeps track of the amount of nucleotides
		}// end for loop - passes one character at a time
		System.out.println(n1 +" " + n2 + " " + n3 + " " + n4);
	}//end ReadFile method
	public void closeDNAFile(){
		content.close();//close file
	}// end closeDNAFile method
	public static void main(String[] args){
		DNAFile data = new DNAFile();
		data.openDNAFile();// call openDNAFile method
		data.readDNAFile();// call readDNAFile method
		data.closeDNAFile();//call closeDNAFile method
	}// end main
}// end class DNAFile
