package main.java;

public class _905 {
    public int[] sortArrayByParity(int[] A) {

        int oddPtr=0;
        int evenPtr=A.length-1;
        int temp;
        while(oddPtr<evenPtr){
            if(A[oddPtr]%2==0) //Odd ptr pointing to even digit
            {   oddPtr++;
                continue;
            }

            if(A[evenPtr]%2!=0) //Even ptr pointing to odd digit
            {   evenPtr--;
                continue;
            }

            temp=A[oddPtr];
            A[oddPtr]=A[evenPtr];
            A[evenPtr]=temp;
            oddPtr++;
            evenPtr--;
        }

        return A;
    }
}
