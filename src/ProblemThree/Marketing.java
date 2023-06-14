package ProblemThree;

import java.util.Objects;

public class Marketing {
    String employeename;
    String productname;
    double salesamount;

    Marketing(String employeename,String productname,double salesamount){
        this.employeename = employeename;
        this.productname = productname;
        this.salesamount = salesamount;
    }

    public String getEmployeename(){
        return employeename;
    }
    public String getProductname(){
        return productname;
    }
    public double getSalesAmount(){
        return salesamount;
    }

    @Override
    public String toString(){
        return "Employeename " + employeename + " Productname " + productname + " Salesamount " + salesamount;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Marketing m = (Marketing)o;
        return Objects.equals(employeename,m.employeename) && Objects.equals(productname,m.productname) && Double.compare(salesamount,m.salesamount) == 0 ;

    }


}
