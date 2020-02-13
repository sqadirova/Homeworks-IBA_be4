package warmup_tasks.lesson04;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class operationsWithString {
//    private static void generate_SmallLetters(int LEN) {
//        int start = 97; //a
//        int end = 122; //z
//
//        Random r = new Random();
//        StringBuffer sb = new StringBuffer(LEN);
//        for (int i = 0; i < LEN; i++) {
//            int rdm = start + (int) (r.nextFloat() * (end - start + 1));
//            sb.append((char) rdm);
//        }
//        System.out.println(sb.toString());
//    }
//
//    private static void generate_CapitalLetters(int LEN) {
//        int start = 65; //a
//        int end = 90; //z
//
//        Random r = new Random();
//        StringBuffer sb = new StringBuffer(LEN);
//        for (int i = 0; i < LEN; i++) {
//            int rdm = start + (int) (r.nextFloat() * (end - start + 1));
//            sb.append((char) rdm);
//        }
//        System.out.println(sb.toString());
//    }

//    private static void generate_MixedLetters(int LEN) {
//        int start = 97; //a
//        int end = 122; //z
//
//        Random r = new Random();
//        StringBuffer sb = new StringBuffer(LEN);
//        for (int i = 0; i < LEN; i++) {
//            int rdm = start + (int) (r.nextFloat() * (end - start + 1));
//            sb.append((char) rdm);
//        }
//        String str1=new String(sb.toString());
//        String str2=new String(sb.toString());
//        StringBuilder sbuilder=new StringBuilder();
//        for (int i = 0; i < str1.length(); i++) {
//            sbuilder.append(str1.charAt(i));
//            if (i<str2.length()){
//                sbuilder.append(str2.charAt(i));
//            }
//        }
//
//        System.out.println(sbuilder.toString());
//
//    }

    public static boolean isSmall(char c){
        return c>='a' && c<='z';
    }
    public static boolean isCapital(char c){
        return c>='A' && c<='Z';
    }
    public static boolean isMixed(char c){
        return isCapital(c) || isSmall(c);
    }
    public static boolean isSmallVowel(char c){
        final String vowels="aeoiu";
        return vowels.indexOf(Character.toLowerCase(c))>=0;
        //same:
//        if(vowels.indexOf(c)>=0) return true;
//        else return false;
        //same:
       // return "aeoiu".indexOf(c)!=-1;
    }
    public static boolean isSmallConsonant(char c){
        return !isSmallVowel(c);
    }
    public static boolean isCapitalVowels(char c){
        final String vowels="AEOIU";
        return vowels.indexOf(Character.toUpperCase(c))>=0;
    }
    public static boolean isCapitalConsonant(char c){
      return !isCapitalVowels(c);
    }
    public static boolean isCapitalAndSmallConsonant(char c){
        return isCapitalConsonant(c)||isSmallConsonant(c);
    }
//    public static boolean isSplitSmallandCapitalLetters(String str1){
//        String[] r= str1.split("(?=\\p{Upper})");
//
//    }





    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please,enter the lenght of string:");
        int n = in.nextInt(); //Length of st
//        System.out.println("Small letters:");
//        generate_SmallLetters(n);
//        System.out.println("Capital letters:");
//        generate_CapitalLetters(n);
//        System.out.println("Small and capital letters:");
//        generate_MixedLetters(n);

    }


}

