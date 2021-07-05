package main.java;

public class _1915 {
        public long wonderfulSubstrings(String word) {
            long res = 0, count[]  = new long[1024]; // since we have only chars from a to i that is 10 chars i.e. 2^10 =1024 possibilities
            int cur = 0;
            count[0] = 1L;
            for (int i = 0; i < word.length(); ++i) { //since string jave character from a to j=10 chars
                cur ^= 1 << (word.charAt(i) - 'a');
                //  Count all substrings that has same mask
                res += count[cur];

                //Count all substrings that differs by 1 character
                for (int j = 0; j < 10; ++j) {
                    res += count[cur ^ (1 << j)];
                }

                //for future use
                count[cur]++;

            }
            return res;
        }

    }