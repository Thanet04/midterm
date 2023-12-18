package check;

public class checkTwoLetter {

	public boolean checkTwoLetter(String letter){
			
			if(letter.length()<=1){
				return false;
			}
			else if(letter.length()==2){
				return true;
			}
			
			String firsTwotLetter = letter.substring(0,2);
			String lastTwoLetter = letter.substring(letter.length()-2);
			
			return letter.equals(letter);	
		}

}
