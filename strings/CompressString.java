package strings;

public class CompressString {
	
	 if (s == null){                 
         return null; }                     
     if (s.length() == 0){                   
         return ""; }                
 int count=1;                
     int n=s.length();              
     String out="";                    
      out+=s.charAt(0);     //a3b            
     for(int i=1;i<n;i++){      //xxxxx         
         char curr=s.charAt(i);             
         char  prev=s.charAt(i-1);             
         if(curr==prev)                    
             count++;      //2           
         else{                           
             if(count>1)                 
             out+=count;                       
                                                         
             out+=curr;           
             count=1;     //1      
         }                         
     
     }   //loop end

     if(count>1)
         out+=count;

     return out;
      }
       }
     

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
