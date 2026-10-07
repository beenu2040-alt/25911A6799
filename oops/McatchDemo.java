class McatchDemo {
    public static void main(String args[]) {
        try {
            int a = args.length;
            System.out.println(a);

            int b = 42 / a;

            int c[] = {1};
            c[42] = 99;
        }
        catch (ArithmeticException e) {
            System.out.println("division by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array exception " + e);
        }
    }
}
