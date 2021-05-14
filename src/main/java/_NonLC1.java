package main.java;

public class _NonLC1 {
        public boolean check(int[] arr, int k) {
            for(int val : arr) {
                if(val != 0 && val != k) return false;
            }
            return true;
        }

        public int perfectSubstring(String s, int k) {
            int res = 0;
            for(int i=0; i<s.length(); i++) {
                int[] arr = new int[10];
                for(int j = i; j<s.length(); j++) {
                    if(j > i + (10*k)) break;
                    char ch = s.charAt(j);
                    arr[ch-'0']++;
                    if(check(arr, k)) res++;
                }
            }
            return res;
        }

    }
