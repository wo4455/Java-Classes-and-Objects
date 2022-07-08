class Main {
  public static void main(String[] args) {
    
    Client client = new Client(1, "Bill", "1234");
    
    Account testAccount = new Account(1122, 20000, 4.5);

    client.addAccount(testAccount);

    testAccount.withdraw(500);
    
    testAccount.deposit(3000);

    client.removeAccount(1122);

    System.out.println(client.printInfo());
  }
}
