package main.java;

public class _925 {
    public boolean isLongPressedName(String name, String typed) {

        int typedLen=typed.length();
        int nameLen=name.length();
        int n=0;
        int t=0;
        while(t<typedLen|| n< nameLen){

            //in Typed search till characters are same
            while(t+1<typedLen && (typed.charAt(t)==typed.charAt(t+1)))
                t++;

            System.out.println(name.charAt(n) +" "+typed.charAt(t)+ n+" "+t);

            if(t<typedLen && n< nameLen && typed.charAt(t)!=name.charAt(n))
                return false;
            if((t<typedLen) != (n< nameLen ))
                return false;

            //if only single char left
            if(t+1==typedLen-1){
                if(typed.charAt(t+1)==name.charAt(n+1))
                    return true;
            }

            t++;n++;
        }

        return true;
    }
}
