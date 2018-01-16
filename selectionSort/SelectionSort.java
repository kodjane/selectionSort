
public class SelectionSort {

	public static void triParSelection(int [] tab) {
	
		for (int i = 0; i < tab.length; i++) {
		 int imin = i; // on sauvegarde l'indice du minimum
		 
		 // on compare l'element du début avec les autres danas le tableau
		 // si l'element i est plus petit alors il devient le minimum
		 // Donc on sauvegarde son indice
		 for (int j = i+1; j < tab.length; j++) {
			if(tab[imin] > tab[j])
				imin = j;
		}
		 
		 // permutation 
		 int tmp = tab[i];
		 tab[i] = tab[imin];
		 tab[imin] = tmp;
		 
//		 System.out.println("Le minimum est à la position " +imin+" et à pour valeur " + tab[imin]);
		 // Affiche du tableau après le tri, j'affiche à l'interieur de la boucle pour voir toute les etapes du tro
		 for (int k = 0; k < tab.length; k++) {
				System.out.print(tab[k] + " " );
			}
		System.out.println(" "); 

	}	
	}
	
	public static void main(String[] args) {
	int [] tab = {13,7,9,6,3,2,14};
	triParSelection(tab);
	}

}
