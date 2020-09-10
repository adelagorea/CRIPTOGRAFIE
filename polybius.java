
public class polybius {
	

	void cipher(String plainText) {
		plainText = plainText.toUpperCase(); //conversia caracterelor din minuscule in majuscule
		plainText = plainText.replace(" ", "");//spatiere intre caractere
		plainText = plainText.replace("J", "I");//inlocuirea caracterului J cu caracterul I
		
		// Crearea matricei
		char allsimbol[][] = {{'A','B','C','D','E'}, {'F','G','H','I','K'}, {'L','M','N','O','P'},
								{'Q','R','S','T','U'}, {'V','W','X','Y','Z'}};
		
		//partea declarativa
		int len = plainText.length();//lungimea sitului
		char letter;
		for(int i = 0; i < len; i++) { //parcurgerea sirului
			
			letter = plainText.charAt(i);//memorarea pozitiei caracterelor
			
			for(int j = 0; j < 5 ; j++) {   //parcurgerea pe linie si determinarea pozitiei
				for(int k = 0; k < 5; k++) { //parcurgerea pe coloana si determinarea pozitiei
					
					if(letter == allsimbol[j][k]) { // daca litera corespunde simbolului din matrice returneaza pozitia pe linie si coloana
						int row = j + 1;
						int col = k+1;
						
						System.out.print(row +""+ col); //afisare codului caracterului criptat
						System.out.print("\t");
					}
						
				}
			}
			
		}
	}
}
