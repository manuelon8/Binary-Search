package app.main.developments;

public class OrderIntArrrays {
	
	
	 private int size = 0; //numElement
	 private int[] Values;	//Element
	 int curIn=0;
	 
	 
	 
	 
	public OrderIntArrrays() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderIntArrrays(int[] vals) {		 
		this.Values=vals;
		this.size=vals.length;
		order2(vals);
	}
	
	public void printArray(){
		for(int i =0; i<this.Values.length; i++) {
			System.out.println(i + "-" + Values[i]);
		}
		
	}
 
	
	public int first() {
		return Values[0];		
	}
	
	public int last() {
		return Values[Values.length-1];
	}
	
	/*
	 * metodo para ordenar
	 * pregunta desde el inicio del array si el valor siguiente es mayor q el actual 
	 * de ser asi usa una variable temporal y va intercambiando valores
	 * hace esto hasta q la  flag cambie de valor
	 * 
	 */
	public int[] order2(int[] a){
		int i, temp;
		boolean swapFlag;
	
		do {
			swapFlag = false;
			for(i = 0; i < a.length - 1; ++i) {
				if( a[i] > a[i+1]) {
					temp = a[i + 1];
					a[i + 1] = a[i];
					a[i] =  temp;
					swapFlag = true;
				} 
			}
			
		}while(swapFlag);	
		
		return a;
	}
 
	
	/*
	 * find:
	 * 
	 * 
	 * Recibe una llave a buscar	 * 
	 * 	retorna indice donde se  encuentra
	 * 
	 */
 
	public int findValue(int key) {

		int low = 0;
		int high = size - 1;
		int index = 0;
		try {
			 
			while (low <= high) {
				int mid = (low + high) / 2;				 
				if (this.Values[mid] < key) {
					//mitad superior
					low = mid + 1;
				} else if (this.Values[mid] > key) {
					//mitad inferior
					high = mid - 1;
				} else if (this.Values[mid] == key) {
					index = mid;	break;
				}			 
 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return index;
	}
	
	
 
     public int binaryInsert(int insertKey) {
        int lowerBound = 0;
        int upperBound = size - 1;

        while (true) {
        	
            curIn = (upperBound + lowerBound) / 2;
            if (size == 0) {
                return curIn = 0;
            }
            if (lowerBound == curIn) {
                if (Values[curIn] > insertKey) {
                    return curIn;
                }
            }
            if (Values[curIn] < insertKey) {
                lowerBound = curIn + 1;          // its in the upper 
                if (lowerBound > upperBound) {
                    return curIn += 1;
                }
            } else if (lowerBound > upperBound) {
                return curIn;
            } else {
                upperBound = curIn - 1;          // its in the lower   
            }
        }
    }   
     
     
     /*
      * Primero localiza donde va a insertar a traves del binarysearch
      * luego asigna el curIn en la posicion correcta y empuja los otros valores hacia arriba 
      * para luego insertar
      */
 
    public boolean insert(int value) {             // inserta dentro del array
    	boolean response = false;
    	binaryInsert(value);
        int j = curIn;
        int k;
        try {
        	for (k = size; k > j; k--) {           // mueve el grande hacia arriba.
            	Values[k] = Values[k - 1];
            }
            this.Values[j] = value;                            // inserta el value
            this.size++;                                // incrementa tamaño.
            response = true;	
		} catch (Exception e) {
			e.printStackTrace();
		}        
        
        return response;
    }
    
    /*
     * 		Borra los elemntos solo si este se encuentra en el array
     * 		es decir si la funcion findValue devuelve algo diferente a 0
     */
	public boolean delete(int x) {
		boolean response = false;
		int i = findValue(x);
		if(i!=0) {			
			if (this.Values[i] == x) {
			for (int j = i + 1; j < size; j++)
				this.Values[j - 1] = this.Values[j];
			this.size--;
			response = true;
		}	
		}
		
		return response;
	}

	public int getsize() {
		return size;
	}



	public void setsize(int size) {
		this.size = size;
	}



	public int[] getValues() {
		return Values;
	}



	public void setValues(int[] values) {
		Values = values;
	}
	 
	 
	 
		
	}


