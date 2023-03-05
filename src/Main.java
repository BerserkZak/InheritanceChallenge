public class Main {

    public static void main(String[] args) {
        Employee Steve = new Employee("Steve", "11/12/1998", "05/12/2006");
        System.out.println(Steve);
        System.out.println("Age = " + Steve.getAge());
        System.out.println("Pay = " + Steve.collectPay());

        SalariedEmployee Joe = new SalariedEmployee("Joe", "11/07/1993"
                , "05/12/2012"
                , 35000.00);
        System.out.println(Joe);
        System.out.println(Joe.collectPay());
        Joe.retire();
        System.out.println(Joe.collectPay());

        HourlyEmployee Mary = new HourlyEmployee("Mary", "01/01/2000", "01/02/2003", 2);
        System.out.println(Mary);
        System.out.println(Mary.collectPay());
        System.out.println(Mary.getDoublePay());


    }

}
