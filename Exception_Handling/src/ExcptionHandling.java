public class ExcptionHandling {

    public static void main(String[] args) {
//        try{
//            System.out.println("this is one");
//        } catch (Exception1 exVar1){
//            handler for exception1;
//        } catch (Exception2 exVar2){
//            handler for exception2;
//        }

        try{
            method();
            System.out.println("After the method call");
        }
        catch (ArithmeticException ex){
            System.out.println("ArithmeticException");
        }
        catch (RuntimeException ex){
            System.out.println("RuntimeException");
        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }
    static void method() throws Exception{
        System.out.println(1/0);
    }

}
