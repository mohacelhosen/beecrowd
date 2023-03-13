import java.util.Scanner;

public class Q1049_Animal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word1 = in.next().toLowerCase();
        String word2 = in.next().toLowerCase();
        String word3 = in.next().toLowerCase();

        if(word1.equals("vertebrado")){
            if(word2.equals("ave")){
                if(word3.equals("carnivoro")){
                    System.out.println("aguia");
                }else{
                    System.out.println("pomba");
                }
            }else{
                if(word3.equals("onivoro")){
                    System.out.println("homem");
                }else{
                    System.out.println("vaca");
                }
            }
        }else{
            if(word2.equals("inseto")){
                if(word3.equals("hematofago")){
                    System.out.println("pulga");
                }else{
                    System.out.println("lagarta");
                }
            }else{
                if(word3.equals("hematofago")){
                    System.out.println("sanguessuga");
                }else{
                    System.out.println("minhoca");
                }
            }
        }
    }
}
