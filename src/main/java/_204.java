package main.java;

public class _204 {
    public int countPrimes(int n) {
        int count=0;
        if(n==0|| n==1)
            return count;
        boolean[] isPrime=new boolean[n];

        for(int k=2;k<n;k++){
            if(!isPrime[k])
                count++;
            for(int j=2;k*j<n;j++){
                isPrime[k*j]=true;
            }
        }

        return count;
    }
}


/*
* Brute force

public int countPrimes(int n) {
        int count=0;
        if(n==0|| n==1)
        return count;

        for(int k=2;k<n;k++){
        if(isPrime(k))
        count++;
        }

        return count;
        }

public boolean isPrime(int n){

        boolean primeFlag=true;
        for(int i=2;i*i<=n;i++){
        if(n%i==0){
        primeFlag=false;
        break;
        }

        }

        return primeFlag;
        }
* */