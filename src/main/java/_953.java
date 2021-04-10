package main.java;

import java.util.HashMap;
import java.util.LinkedHashMap;

class _953 {
    HashMap<Character,Integer> hm;
    public boolean isAlienSorted(String[] words, String order) {
        hm=new LinkedHashMap<Character,Integer>();
        boolean result=true;

        for(int i=0;i<order.length();i++){
            hm.put(order.charAt(i),i);
        }

        for(int i=0;i<words.length-1;i++){
            result=compareLexographically(words[i],words[i+1]);

            if(result)
                continue;
            else
                break;
        }
        return result;
    }

    public boolean compareLexographically(String str1,String str2){
        boolean res=true;
        int i1=0;
        int i2=0;
        int sameCharCount=0;

        for(;i1<str1.length()&i2<str2.length();i1++,i2++)
        {
            System.out.println(hm.get(str1.charAt(i1))+" : "+hm.get(str2.charAt(i2)));
            if(hm.get(str1.charAt(i1))-hm.get(str2.charAt(i2))!=0){
                return ((hm.get(str1.charAt(i1))-hm.get(str2.charAt(i2))>0))?false:true;
            }
            else
                sameCharCount++;
        }

        if(sameCharCount==i2){
            if(str2.length()<str1.length())
                res=false;
        }

        return res;
    }
}
