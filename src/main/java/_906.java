package main.java;

public class _906 {
        public int superpalindromesInRange(String left, String right) {
            long l=Long.valueOf(left);
            long r=Long.valueOf(right);
            int ans = 0;
            int maxInt = 100000;

            //Create even palindromes

            for(int i=1;i<maxInt;i++){
                StringBuilder sb=new StringBuilder(Integer.toString(i));
                for(int j=sb.length()-1;j>=0;j--){
                    sb.append(sb.charAt(j));
                }

                long n =Long.valueOf(sb.toString());
                n*=n;
                if(n>r) break;
                if(n>= l& isPalimdrome(n))
                    ans++;

            }

            //Odd palimdrone
            for(int i=1;i<maxInt;i++){
                StringBuilder sb=new StringBuilder(Integer.toString(i));
                for(int j=sb.length()-2;j>=0;j--){
                    sb.append(sb.charAt(j));
                }

                long n =Long.valueOf(sb.toString());
                n*=n;
                if(n>r) break;
                if(n>= l& isPalimdrome(n))
                    ans++;

            }


            return ans;
        }
        /*
        Say P = R^2  is a superpalindrome.

        Because R is a palindrome, the first half of the digits in R determine R up to two possibilities. We can iterate through these digits: let kk be the first half of the digits in R. For example, if k = 1234, then R = 1234321 or R = 12344321 Each possibility has either an odd or an even number of digits in R.

        Notice because P < 10^18 , R < (10^18)^1/2 = 10^9
        and R = k|k' , so that k < 10^5  =MAGIC, our magic constant.*/
        public boolean isPalimdrome(long s){
            return s == reverse(s);
        }

        public long reverse(long s){
            long res=0;

            while(s>0){
                res= res*10+ s%10;
                s=s/10;
            }
            return res;
        }
    }
