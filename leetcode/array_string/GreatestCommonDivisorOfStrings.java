package array_string;

public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String firstString, String secondString) {
        //if(!(firstString + secondString).equals(secondString + firstString)) return "";
        if(!isConcatenationEqual(firstString, secondString)) return "";

        int commonGCD = computeGCD(firstString.length(), secondString.length());
        return firstString.substring(0, commonGCD);
    }
    
    private boolean isConcatenationEqual(String firstString, String secondString){
        return (firstString + secondString).equals(secondString + firstString);
    }

    // Euclidean algorithm
    private int computeGCD(int a, int b){
        /* 
        while(b != 0){
            b = a%b;
            a = b;
        }
        return a;
        */
        return (b == 0) ? a : computeGCD(b, a%b);

    }
}
