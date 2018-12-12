package app.main.developments;

public class OrderIntArrrays {
	
	
	 private int size = 0; //numElement
	 private int[] Values;	//Element
	 
	 
	 
	public OrderIntArrrays(int[] vals) {		 
		this.Values=vals;
		this.size=vals.length;
		// TODO Auto-generated constructor stub
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
	
	public int search(int value) {
		if(size==0)return 0;
		if(value<=first())return 0;
		if (value == last()) return size-1;
		 return 0;
	}
	
	public int eficientSearch(int v, int l, int u) {
		if(u==l+1)return u;
		else {
			int m = (l+u)/2;
			
		}
		return 0;
	}
	
	public int find(int searchKey) {
        int currentPosition;
        int lowerBound = 0;
        int upperBound = size - 1;

        while (true) {
            currentPosition = (lowerBound + upperBound) / 2;

            if (Values[currentPosition] == searchKey) {
                return currentPosition;
            } else if (lowerBound > upperBound) {
                return size;
            } else {
                // left part
                if (searchKey < Values[currentPosition]) {
                    upperBound = currentPosition - 1;
                }
                // right part
                else {
                    lowerBound = currentPosition + 1;
                }
            }
        }
    }
	
    public void insert(int newItem) {
        int i;
        try {
        	// busca una posicion para insertar
            for (i = 0; i < size; i++) {
                if (Values[i] > newItem) break;

                //  sube los elementos grandes
                for (int j = size; j >= i; j--) {
                    Values[j] = Values[j-1];
                }

                Values[i] = newItem;
                size++;
            }	
		} catch (Exception e) {
			e.printStackTrace();
		}
        

    }
    
    public boolean delete(int searchKey) {
        int pos = find(searchKey);
        System.out.println("pos = " +pos);
        if (pos != size) {
            for (int i = pos; i < size; i++) {
            	this.Values[i] = this.Values[i+1];
            }
           // size--;
            return true;
        }

        return false;
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


