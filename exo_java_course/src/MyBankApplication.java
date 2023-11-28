public class MyBankApplication {
//    public static void start() throws IOException{
//        BankAccount bankAccount = new BankAccount();
//        try {
//            bankAccount.deposit(-80);
//        } catch (IOException e) {
//            //throw new RuntimeException(e);
//            System.out.println("logging");
//            throw e;
//        }
//    }
    public static void start(){
        BankAccount bankAccount = new BankAccount();
        try{
            bankAccount.deposit(-90);
        }
        catch(BankAccountException e){
            //e.printStackTrace();
            System.out.println(e.getCause().getMessage());

        }
    }

}
