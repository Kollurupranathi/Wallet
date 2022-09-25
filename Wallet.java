import java.util.Scanner;
class WalletPay{
    private float amount=0;
    
    public float addCash(float cash){
        if(cash>=0){return (amount +=cash);}
        return Float.parseFloat("Amount Cannot be negative");}
    public float payCash(float cash){
        if(cash>=0){return (amount -=cash);}
        return Float.parseFloat("Amount Cannot be negative");}
    public float CheckBalance(){return amount; }

}
public class Wallet {
    public static void main(String[] args){
        WalletPay obj = new WalletPay();
        Scanner in = new Scanner(System.in);
        
        while(in.hasNextLine()){
            String mystr = in.nextLine();
            if(mystr.equals("")){break;}
            else{
                String[] arr = mystr.split(", ", 0);
                if (arr[0].equals("add")){System.out.println(obj.addCash(Float.parseFloat(arr[1])));}
                else if (arr[0].equals("pay")){System.out.println(obj.payCash(Float.parseFloat(arr[1])));}
                else if (arr[0].equals("Show Balance")){System.out.println(obj.CheckBalance());}
                else{
                    System.out.println("Enter any Query");
                }  
            }
        }
        in.close();   
}}
