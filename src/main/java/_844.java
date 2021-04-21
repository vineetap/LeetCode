package main.java;

public class _844 {
    public boolean backspaceCompare(String s, String t) {
        int sPtr=s.length()-1;
        int tPtr=t.length()-1;
        int skipS=0,skipT=0;

        while(sPtr>=0 || tPtr >=0){
            //Search for next possible character in build(S)
            while(sPtr>=0){
                if(s.charAt(sPtr)=='#'){skipS++;sPtr--;}
                else if(skipS>0){ skipS--;sPtr--;}
                else break;
            }
            //Search for next possible character in build(T)
            while(tPtr>=0){
                if(t.charAt(tPtr)=='#'){skipT++;tPtr--;}
                else if(skipT>0){ skipT--;tPtr--;}
                else break;
            }

            if(sPtr>=0 && tPtr >=0 && s.charAt(sPtr)!=t.charAt(tPtr))
                return false;

            if((sPtr>=0 )!= (tPtr >=0))
                return false;

            sPtr--;tPtr--;
        }
        return true;
    }

   /*
   Using Stack
   public boolean backspaceCompare(String s, String t) {
        return generateTypedOutString(s).equals(generateTypedOutString(t));
    }

    public String generateTypedOutString(String s){

        Stack<Character> stack=new Stack<Character>();

        for(Character c:s.toCharArray())
        {
            if(c!='#')
                stack.push(c);
            else if(!stack.empty())
                stack.pop();
        }
        return String.valueOf(stack);

    }*/
}
