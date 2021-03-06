class VetorUtils {

	static void swap(int data[], int pos1, int pos2){
		
		int x = data[pos1];
		data[pos1] = data[pos2];
		data[pos2] = x;
		
	}
	
	static void bubblesort(Vector v, int n) {
		
		for(int i = 0; i < n - 1; i++){
			for(int j = n - 1; j > i; j--){
				if (v.data[j] < v.data[j - 1])
					swap(v.data, j, j - 1);
			}				
		}
		
	}
	
	static void insertionSort(Vector v, int n) {

		int i, j, k;
		
		for (i = 1; i < n; i++) {
			
			k = v.data[i];
			
			j = i - 1;
			
			while  (j >= 0 && v.data[j] > k) {
				v.data[j + 1] = v.data[j];
				j--;
			}
			
			v.data[j + 1] = k;
			
		}
		


	}
	
	static void merge(int A[], int p, int q, int r){

    	int n1 = q - p + 1;
    	int n2 = r - q;
    	int i, j, k;
    	
    	p--;
    	
    	int L[] = new int[n1];
    	int R[] = new int [n2];
    	
    	for (i = 0; i < n1; i++)
    		L[i] = A[p + i];
    		
 	    for (i = 0; i < n2; i++)
    		R[i] = A[q + i];
    		
    	i = 0;
    	j = 0;
    	
    	for (k = p; k < r; k++) {
    	
    		if (i == n1 && j < n2) {
    		
    		    while (k < r) {
    			    A[k] = R[j];
    				k++;
    				j++;
    			}
    			
            } else if (i < n1 && j == n2){
    		
         		while (k < r) {
    			    A[k] = L[i];
    				k++;
    				i++;
    			}
    		
    	    } else if (i < n1 && j < n2) {
    	
    		   if (L[i] <= R[j]){
         			A[k] = L[i];
    				i++;
    			} else {
    				A[k] = R[j];
    				j++;
    			}
    		
    		}
    	
    	}
    	


    }

   static void mergesort(Vector vet[], int p, int r) {
    	
    	if (p < r) {
    		int q = (p + r) / 2;
    		mergesort(vet, p, q);
    		mergesort(vet, q + 1, r);
    		merge(vet.data, p, q, r);
    	}

    }
	
	
}