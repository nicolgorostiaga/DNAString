#include <iostream>
#include <fstream>
#include<cstdlib>
using namespace std;

void fileOpen(ifstream &infile);
int main(){
	char letter;
	int n1=0,n2=0,n3=0,n4=0;
	ifstream infile;
	infile.open("reaslind_dna.txt");
	fileOpen(infile);
	while(infile.get(letter)){
		letter = toupper(letter);
		switch(letter){
			case'A': n1++;
			break;
			case'C': n2++;
			break;
			case 'G': n3++;
			break;
			case 'T': n4++;
			break;
		}// end switch
	}//end while loop
	cout << n1 << " " << n2 << " " << n3 << " " << n4 << endl;
	infile.close();
	return 0;
}// end main
//******************************************************************
void fileOpen(ifstream &infile){
	if(!infile){
		cout <<"File did not open --- terminating." << endl;
		exit();
	}//end if
}// makes sure the file opens correctly
