public class Testpad1 {

    public static void main(String[] args) {
        String secret = "aaaabb";
        String guess = "aa";
        String cap = "";
        int i = 0;

        for(int bI = 0; bI+guess.length()<=secret.length(); bI++) {
	        cap = secret.substring(bI,bI+guess.length());
	        if(cap.equals(guess)) i++;
	
	    }

        cap = (guess.length()>secret.length())?"a":"b"; // Short-hand if...else...

        System.out.println(i);
    }
}
