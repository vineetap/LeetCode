package main.java;

public class _443 {
    public int compress(char[] chars) {

        int readIndex=0;
        int writeIndex=0;

        int consecutive=1;

        for(int i=0;i<chars.length;i++){

            if(i+1==chars.length || chars[i+1]!=chars[i]){  //i+1==chars.length  --> Once String is exhausted write the remaining char & consecutive
                chars[writeIndex++]=chars[i];

                if(consecutive>1)
                {
                    for(char c:String.valueOf(consecutive).toCharArray()){
                        chars[writeIndex++]=c;
                    }
                }

                consecutive=1;  // reset
            }
            else
                consecutive++;

        }
        return  writeIndex;
    }
}
