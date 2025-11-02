package problem2;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList();
    public Customer(String name)
    {
        this.name=name;
    }

    public ArrayList<Double> getTransactions()
    {
        return transactions;
    }

    public String getName()
    {
        return name;
    }

}
