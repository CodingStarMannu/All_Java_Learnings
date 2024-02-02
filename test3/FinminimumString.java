package test3;

public class FinminimumString {
	public static int length(char input[], int si, int ei){
	    int len = 0;
	    for(int i = si; i <= ei; i++){
	        len++;
	    }
	    return len;

	}

	public static char getString(char input[], int index){
	    return input[index];
	}

	public static void minLengthWord(char input[], char output[]){
	    int prev = -1;
	    int i = 0;
	    int minLength = 0, len = 0;
	    int si, ei;
	    for(; input[i] != '\0'; i++){
	        if(input[i] == ' '){
	            int len = length(input, prev + 1, i - 1);
	            if(len > minLength){
	                minLength = len;
	                si = prev + 1;
	                ei = i - 1;
	            }
	            prev = i;
	        }

	    }
	    length(input, prev + 1, i - 1);
	    if(len > minLength){
	                minLength = len;
	                si = prev + 1;
	                ei = i - 1;
	            }
	    for(int i = 0; i < minLength; i++){
	         output[i] = getString(input, si + i);
	    }



	}

}
