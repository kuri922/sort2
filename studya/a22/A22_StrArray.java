package studya.a22;
import studya.a21.A21_StrArray;



class A22_StrArray extends A21_StrArray {
	
		
	A21_StrArray strArray = new A21_StrArray();
	//‘S‚Ä‚Ì—v‘f‚ğ”z—ñ‚Åæ“¾
	public String [] getAll() {
		return items; 
	}
		
	public int getIndex() {
		System.out.println(items.length);
		return items.length;
	}
	
	
	// ¸‡
	public static final int ASC_SORT = 0;
	// ~‡
	public static final int DESC_SORT = 1;
	// ƒ\[ƒg‚·‚é
	// ˆø” mode ASC_SORT:¸‡^DESC_SORT:~‡
	
	public void sort(int mode) {
		
		if(mode == 0) {
				for(int i= 0; i < items.length-1; i++){
					for(int j = i+1 ; j < items.length; j++){
						//if(items[j] != null) {
							if(items[i].compareTo(items[j]) < 0){
								String k = items[i];
								items[i] = items[j];
								items[j] = k;
							}
						//}
					}
				}
		}
		else {
			for(int i = 0; i < items.length-1; i++){
				for(int j = i+1; j < items.length; j++){
					if(items[j] != null) {
						if(items[i].compareTo(items[j]) > 0){
							String k = items[i];
							items[i] = items[j];
							items[j] = k;
						}
						
					}
				}
			}
			
        }
		for(int j = 0; j < items.length; j++) {
        	System.out.println(items[j]);
		}
        
		
	}
}



