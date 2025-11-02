package problem2;

public class Main {

    public static void main (String[] args)
    {
        Customer c1=new Customer("Omar");
        Customer c2=new Customer("AHmed");
        Bank b=new Bank("BMCE");
        b.addCustomer(c1);
        b.addCustomer(c2);
        b.addTransaction(c1,c2,205.2);
        b.Info(c1);
        b.Info(c2);
    }
}
