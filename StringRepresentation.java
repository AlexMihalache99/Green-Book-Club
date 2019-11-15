/**
 *Given any integer n in range (-2000000000,2000000000) (That is -2 billion to +2 billion), 
 * produce a string that represents it in natural English language..
 *   Example: nr = 1430;
 *           Output: one thousand forty three
 * 
 * */
public class StringRepresentation {
	
	public static void angel1(int x, String s) {
		
		if(x==0) {
		    System.out.print(s);
	    }else if(x==1) {
			System.out.print("one " + s);
		}else if(x==2) {
			System.out.print("two " + s);
		}else if(x==3) {
			System.out.print("three " + s);
		}else if(x==4) {
			System.out.print("four " + s);
		}else if(x==5) {
			System.out.print("five " + s);
		}else if(x==6) {
			System.out.print("six " + s);
		}else if(x==7) {
			System.out.print("seven " + s);
		}else if(x==8) {
			System.out.print("eight " + s);
		}else if(x==9) {
			System.out.print("nine " + s);
		}
	}
	
	public static void angel2(int x, String s) {
		
		 if(x==2) {
			System.out.print("twenty " + s);
		}else if(x==3) {
			System.out.print("thirty " + s);
		}else if(x==4) {
			System.out.print("fourty " + s);
		}else if(x==5) {
			System.out.print("fifty " + s);
		}else if(x==6) {
			System.out.print("sixty " + s);
		}else if(x==7) {
			System.out.print("seventy " + s);
		}else if(x==8) {
			System.out.print("eighty " + s);
		}else if(x==9) {
			System.out.print("ninety " + s);
		}
	}
	
	public static void angel3(int x, String s) {
		
		if(x == 1) {
			System.out.print("eleven " + s);	
		}else if(x == 2) {
			System.out.print("twelve " + s);	
		}else if(x == 3) {
			System.out.print("thirteen " + s);	
		}else if(x == 4) {
			System.out.print("fourteen " + s);	
		}else if(x == 5) {
			System.out.print("fifteen " + s);	
		}else if(x == 6) {
			System.out.print("sixteen " + s);	
		}else if(x == 7) {
			System.out.print("seventeen " + s);	
		}else if(x == 8) {
			System.out.print("eighteen " + s);	
		}else if(x == 9) {
			System.out.print("nineteen " + s);	
		}else if(x == 0) {
			System.out.print("ten " + s);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nr = -10;
		
		int array[] = new int [11];
		int length = 0;
		
		if(nr < 0 ) {
			System.out.print("minus ");
			nr = Math.abs(nr);
		}
		
		while(nr!=0) {
			array[length] = nr%10;
			nr/=10;
			length++;
		}
		
		
		String thousand ="thousand ";
		String hundred = "hundred ";
		String million = "million ";
		String billion = "billion ";
		
	   for(int i = length -1; i>=0;i--) {
		    
		  if(i == 0) {///0..9		   
		     if(array[i] !=0) {
			     angel1(array[i],"");
		   }
		  } else if(i == 1) {///10...99		   
		     
               if(array[i] !=1) {
            	 angel2(array[i],"");
               }else {
				 angel3(array[i-1], "");
					i--;
               }
		   } else if(i == 2) {///100.999		   
			     
			   if(array[i]!=0){
				   angel1(array[i], hundred);
			   }
		   } else if(i == 3) {///1000...9999		   
			   if(array[i]!=0){
				   angel1(array[i], thousand);
			}
		   } else if(i == 4) {///10000...99999
			   
			   if(array[i] !=1) {
            	 angel2(array[i], "");
               }else {
               	 angel3(array[i-1], thousand);	
            	   i--;
				}
			} else if(i == 5) {	///100000...999999
				if(array[i]!=0){
					   angel1(array[i], hundred);
				}
			} else if(i == 6) {///1000000...9999999
				if(array[i]!=0){
					   angel1(array[i], hundred);
				}
			} else if(i == 7) {///10000000...99999999		   
				if(array[i] !=1) {
	             angel2(array[i],"");
	            }else {
				 angel3(array[i-1], million);	
				   i--;
					}		  
			} else if(i == 8) {///100000000...999999999
				if(array[i]!=0){
					   angel1(array[i], hundred);
				}
			} else if(i == 9) {///1000000000...2000000000		   
				angel1(array[i], billion);
			}

		   
	   }
		
			
	}
}


