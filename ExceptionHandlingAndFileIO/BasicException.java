public class BasicException {

    public static void main(String[] args) {
        try {
            double result = 2/0;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Because failed because: "+ e.getMessage());
        }
    }
}