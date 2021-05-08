package main.java;

public class _205 {
     public boolean isIsomorphic(String s, String t) {
            int sLen=s.length();
            int tLen=t.length();
            if(sLen!=tLen)
                return false;

            int[] sArr=new int[256];
            int[] tArr=new int[256];

            for(int i=0;i<sLen;i++){
                if(sArr[s.charAt(i)]!=tArr[t.charAt(i)])
                    return false;
                sArr[s.charAt(i)]=i+1; // why i+1, why not i -> see comment below
                tArr[t.charAt(i)]=i+1;
            }

            return true;
        }
    }
/*
int[] m1 = new int[256] initialize the array value to 0. consider this situation ,
 s = ab, t=aa. the first iteration i is equal to 0, therefore, when m1[s.charAt(i) ] = i is executed, the m1[a] and m2[a]
 value does not change. the next iteration will find m1[b] == m2[a] (both values are equal to 0).
*/
