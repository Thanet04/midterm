package Number;

public class Number {
	
	public String firsTwotLetter,lastTwoLetter;
	public int count = 0;

	public int countLetterA(String word){
		
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)=='a'|| word.charAt(i)=='A'){
				count++;
			}
		}
		return count;
	}

}
