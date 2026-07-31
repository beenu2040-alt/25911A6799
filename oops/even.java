class even{
    public static void main(String args[]){
        int a=7;
        boolean flag=false;
        for(int i=2;i<a;i++){
            if(a%i==0){
                System.out.println("the number is even");
                flag=true;
                break;
            }
        }
        if (!flag){
            System.out.println("the number is odd");
        }
        
    }
}