package main.java;

public class _8 {
    public int myAtoi(String str) {
        str=str.trim();
        if(str.isEmpty())
            return 0;
        int id=0;int total=0;int sign=1;

        if(str.charAt(id)=='+'||str.charAt(id)=='-')
            sign=str.charAt(id++)=='+'?1:-1;

        for(;id<str.length();id++)
        {
            int d=str.charAt(id)-'0';
            // System.out.println("Start : "+d);
            if (d < 0 || d > 9)
                break;
            if(total>Integer.MAX_VALUE/10||(total==Integer.MAX_VALUE/10 && d>Integer.MAX_VALUE%10))
                return sign==-1?Integer.MIN_VALUE:Integer.MAX_VALUE;
            else
                total=total*10+d;
            // System.out.println("End : "+total);

        }
        return total*sign;
    }
}
