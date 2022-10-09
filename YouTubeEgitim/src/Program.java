public class Program {
    public static void main(String[] args) {

        /*int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;
        System.out.println(sayi1);

        int[] sayilar1 = {1,2,3};
        int[] sayilar2 = {10,20,30};
        sayilar1 = sayilar2;
        sayilar2[0] = 1000;
        System.out.println(sayilar1[0]);

        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Calculate();
        creditManager.Save();

        Customer customer = new Customer();
        customer.Id = 1;
        customer.City = "Ankara";

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();

        Company company = new Company();
        company.TextNumber = "100000";
        company.CompanyName = "Arçelik";
        company.Id = 100;

        CustomerManager customerManager1 = new CustomerManager(new Person());

        Person person = new Person();
        person.FirstName = "ertu";
        person.NationalIdentity = "turk";

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();*/

        CustomerManager customerManager = new CustomerManager(new Customer(),new MilitaryCreditManager());
        customerManager.GiveCredit();





    }
}
