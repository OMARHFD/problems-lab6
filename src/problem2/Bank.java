package problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList();
    public Bank(String name)
    {
        this.name=name;
    }

    public void addCustomer(Customer c)
    {
        if (!(customers.contains(c)))
        {
            customers.add(c);
        }
    }

    public void addTransaction(Customer c1,Customer c2,Double transaction)
    {
        if(customers.contains(c1) && customers.contains(c2))
        {
            c2.getTransactions().add(transaction);
            c1.getTransactions().add(-transaction);
        }
    }

    public void Info(Customer c)
    {
        if (customers.contains(c))
        {
            System.out.println(c.getName());
            System.out.println(c.getTransactions());
        }

    }
}
