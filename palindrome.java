

class  palindrome{
    public static void main(String[] args) {
        int n=948,n1=n;
        int rem=0,rev=0;
        while(n!=0){
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
            System.out.println(n1==rev?"palindrome":"not a palindrome");
        }
    }
}