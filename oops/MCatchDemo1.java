public class MCatchDemo1 {
    public static void main(String[] args){

try{

            // ArithmeticException
            int a = 10 / 0;
            int arr[] = new int[5];

            // ArrayIndexOutOfBoundsException
arr[10] = 50;
        }
        catch (ArithmeticException e) {
System.out.println("Arithmetic Exception occurred");
        }
        catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Array Index Out Of Bounds Exception occurred");
        }
        catch (Exception e) {
System.out.println("General Exception occurred");
        }
    }
}

