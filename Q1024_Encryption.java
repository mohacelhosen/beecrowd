
import java.util.Scanner;

public class Q1024_Encryption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        in.nextLine();

        for(int i=0; i<test; i++){
            String str =in.nextLine();
            char[] ch = str.toCharArray();
            String emptyString = "";
            
            for(int j=0; j<ch.length; j++){
                if((ch[j]>=65 && ch[j]<=90) ||(ch[j]>=97 && ch[j]<=122)){
                    ch[j]=  (char) (ch[j]+3);
                } 
                emptyString = ch[j]+emptyString;
            }


            String tempString ="";
            for(int j= (emptyString.length()/2); j<emptyString.length(); j++){
                tempString= tempString+(char)((emptyString.charAt(j))-1);
            }

            String tempString2 ="";

            for(int j=0; j<(emptyString.length()/2); j++){
                tempString2= tempString2+emptyString.charAt(j);
            }

            tempString = tempString2+tempString;
            
            System.out.println(tempString); 
            
        }

            
    }
}


