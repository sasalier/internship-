import java.math.BigInteger;

public class Main {
    public static BigInteger findFib(long n)
    {
        BigInteger arr1[][] = {{BigInteger.ONE, BigInteger.ONE}, {BigInteger.ONE, BigInteger.ZERO}};
        if (n == 0)
            return BigInteger.valueOf(0);
        else
        {
            power(arr1, n - 1);
            return arr1[0][0];
        }
    }

    private static void power(BigInteger arr1[][], long n)
    {
        if (n == 0 || n == 1)
            return;
        BigInteger arr2[][] = {{BigInteger.ONE, BigInteger.ONE}, {BigInteger.ONE, BigInteger.ZERO}};
        power(arr1, n / 2);
        multiply(arr1, arr1);
        if (n % 2 != 0)
            multiply(arr1, arr2);
    }

    private static void multiply(BigInteger arr1[][], BigInteger arr2[][])
    {
        BigInteger x = (arr1[0][0].multiply(arr2[0][0])).add(arr1[0][1].multiply(arr2[1][0]));
        BigInteger y = (arr1[0][0].multiply(arr2[0][1])).add(arr1[0][1].multiply(arr2[1][1]));
        BigInteger z = (arr1[1][0].multiply(arr2[0][0])).add(arr1[1][1].multiply(arr2[1][0]));
        BigInteger w = (arr1[1][0].multiply(arr2[0][1])).add(arr1[1][1].multiply(arr2[1][1]));
        arr1[0][0] = x;
        arr1[0][1] = y;
        arr1[1][0] = z;
        arr1[1][1] = w;
    }
    public static void Hanoi(int n, char mevcut, char hedef, char gecici){
        if (n==1){
            System.out.println(n + ". disk " + mevcut + " konumundan " + hedef + " konumuna gitti");
        }
        else{
            Hanoi(n-1, mevcut, gecici, hedef);
            System.out.println(n + ". disk " + mevcut + " konumundan " + hedef + " konumuna gitti");
            Hanoi(n-1, gecici,hedef,mevcut);
        }
    }


    public static void main(String[] args)
    {
        System.out.println("1. sorunun cevabi: ");
        String  x = findFib(10000).toString();
        String y = x.substring(x.length()-6);
        int z  = Integer.parseInt(y);
        System.out.println("Fibonacci serisinin 10000. elemaninin son 6 basamagi: "+ z);
        System.out.println();
        System.out.println("2. sorunun cevabi: ");
        Hanoi(4, 'A', 'B','C');
        System.out.println();
        System.out.println("3. sorunun cevabi: ");
        EightQueens eightQueens = new EightQueens();
        eightQueens.start();
    }
}
