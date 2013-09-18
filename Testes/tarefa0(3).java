class Main{

	static Vector vetor1;
	
	static Vector vetor2;
	
	static Vector vetor3;
	
	static void main() {
		
		vetor1 = {51, 100, 20, 93, 11, 65, 92, 76, 61, 40, 39, 52, 10, 62, 91};		
		VetorUtils.bubblesort(vetor1, 15);
		
		vetor2 = {51, 100, 20, 93, 11, 65, 92, 76, 61, 40, 39, 52, 10, 62, 91};		
		VetorUtils.insertionsort(vetor2, 15);
		
		vetor3 = {51, 100, 20, 93, 11, 65, 92, 76, 61, 40, 39, 52, 10, 62, 91};
		VetorUtils.mergesort(vetor3, 1, 15);
							
	}
	
	
}



