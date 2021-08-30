package main.java;

public class _151 {
    public String reverseWords(String s) {
        if(s==null) return null;

        char[] a=s.toCharArray();
        int n=a.length;

        reverse(a,0,n-1); //reverse array

        reverseWords(a,n); //reverse words

        return cleanSpaces(a,n);
    }

    private String cleanSpaces(char[] a,int n){
        int i=0,j=0;
        while(j<n){
            while(j<n && a[j]==' ') j++; // skip spaces, start of word
            while(j<n && a[j]!=' ') a[i++]=a[j++]; //copy chars
            while(j<n && a[j]==' ') j++; //skip multiple spaces in between
            if(j<n) a[i++]=' '; //adding one char in between words
        }

        return new String(a).substring(0,i);
    }

    private void reverseWords(char[] a, int n){
        int i=0,j=0;
        while(i<n){
            while(i<j || i<n && a[i]==' ') i++; // skip spaces, start of word
            while(j<i || j<n && a[j]!=' ') j++; //end of word
            reverse(a,i,j-1);
        }
    }

    private void reverse(char[] a, int i,int j){
        while(i<j){
            char temp=a[j];
            a[j--]=a[i];
            a[i++]=temp;
        }
    }
}
