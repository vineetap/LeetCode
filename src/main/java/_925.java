package main.java;

class _925 {
    public boolean isLongPressedName(String name, String typed) {

        int typedLen=typed.length();
        int nameLen=name.length();
        int n=0;
        int t=0;
        int charInNeed=0; //Number of characters in name string 
        char c; //Character in name that we are currently looking at

        while(t<typedLen && n< nameLen){

            c=name.charAt(n);

            charInNeed=0; //reset character in need count

            // Get the number of same character in name
            while( n< nameLen && name.charAt(n)==c)
            {
                charInNeed++;
                n++;
            }

            while( t<typedLen && typed.charAt(t)==c)
            {
                charInNeed--;
                t++;
            }

            if(charInNeed >0)    //Number of characters needed in name is not present in type
                return false;

        }

        return t==typedLen && n==nameLen;
    }
}