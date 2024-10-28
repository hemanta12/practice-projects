public class CustomException {

    public static class InvalidAgeException extends Exception{

        public InvalidAgeException(){
            super("Invalid age to vote");
        }

        public InvalidAgeException(String message) {
            super(message);
        }
        public InvalidAgeException(String message, Throwable cause) {
            super(message, cause);
        }
    }


    public static void main(String[] args) {
        int theirAge = 17;

      try{
          if (theirAge<18){
              throw new InvalidAgeException();
          }else {
              System.out.println("They can vote");
          }
      }catch(InvalidAgeException e){
          System.out.println(e.getMessage());
      }
    }
}
