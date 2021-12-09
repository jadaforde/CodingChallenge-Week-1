package CodingChallenge;

import java.math.BigInteger;
//Problem #2
public class LookandSay {
    public static void main(String[] args){

    System.out.println(lookAndsay(BigInteger.valueOf(Long.parseLong("1213200012171979"))));
    System.out.println(lookAndsay(BigInteger.valueOf(54544666)));
    System.out.println(lookAndsay(BigInteger.valueOf(95)));
    System.out.println(lookAndsay(BigInteger.valueOf(120520)));
    System.out.println(lookAndsay(BigInteger.valueOf(231)));
}

    public static BigInteger lookAndsay(BigInteger num){

        String Numb = num.toString();
        String Num = "";

        if(Numb.length()%2==1){
            return BigInteger.valueOf(-1);
        }
        for(int i = 0;i<Numb.length()-1;i+=2){
            for(int j = Integer.parseInt(Character.toString(Numb.charAt(i)));j>0;j--){
                Num += Character.toString(Numb.charAt(i+1));
            }
        }
        return new BigInteger(Num);
    }


}