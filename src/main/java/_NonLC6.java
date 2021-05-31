package main.java;

public class _NonLC6 {
    public static void main(String[] args) {
        String s1="Featuring stylish rooms and moorings for recreation boats, Room Mate Aitana is a designer hotel built in 2013 on an island in the IJ River in Amsterdam.";
        String result=getFullString(s1,30);
        System.out.println(result);
    }

    private static String getFullString(String s1,int i) {
        String[] str=s1.split(" ");
        StringBuilder sb=new StringBuilder();
        int charCount=0;
        for (String string : str) {
            charCount=charCount+string.length()+1;
            if(charCount <= i){
                sb.append(string+" ");
            }
        }
        return sb.toString().trim();
    }
}
