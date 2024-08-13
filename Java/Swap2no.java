class Swap
{
    // Swap 2 no without using 3rd variable.
    public static void main(String[] args) {
        int a=29;
        int b=38;
        System.out.println("Before Swap,a="+a+" and b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap,a="+a+" and b="+b);
    }
}