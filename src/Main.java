import java.util.Arrays;

class Main{
 /*   static void characters(){
        char charint = 65;
        System.out.println("the integer: "+ charint);

        char charhex = 0x41;
        System.out.println("the hexadecimal value: "+ charhex);

        char charbin = 0b0100001;
        System.out.println("the binary value: "+ charbin);
    }*/
  /*      int[] myarray = new int[]{23, 32, 43, 12, 54, 65, 45, 43, 53};
        System.out.println("the length of your array is "+ myarray.length);
        System.out.println(myarray[0] + " " + myarray[1]);


    }
/*
    String name;
    int age;
    float salary;
    void storevalue(String n, int a, float s){
        name = n;
        age = a;
        salary= s;
    }
    void printvalue(){
        System.out.println(name+ " "+ age+ " "+salary);
    }*/
      /*  int acc_no;
        float amount;
        String name;

        void insert(int a, float amt, String n){
            acc_no = a;
            amount = amt;
            name = n;

        }
        void deposit(float amt){
            amount = amount + amt;
            System.out.println("This amount has been deposited "+ amt);
        }
        void withdraw(float amt) {
            if (amount < amt) {
                System.out.println("insufficient funds");
            } else {
                amount = amount - amt;
                System.out.println("This amount has been redrawn " + amt);

            }
        }
            /*balance*/
          /*  void balance(){System.out.println("balance is " + amount);}
    void display(){System.out.println("the account number is "+acc_no);
            System.out.println("your current money "+amount);
             System.out.println("your name is "+name);}*/
    public static void main(String[]  args){
        Main s1 = new Main();
        Main s2 = new Main();
       /* s1.storevalue("otito", 15, 45000);
        s2.storevalue("k.A.r", 16, 450000);*/
           /* s1.insert(45678987, 560000, "otito");
            s1.display();
            s1.deposit(4500);

            s1.balance();*/
        for(int i=2d;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();//new line
        }

}
}