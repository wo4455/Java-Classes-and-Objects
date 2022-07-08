import java.util.Date;

public class Account {

  private int id;
  private double balance;
  private double annualInterestRate;
  private Date dateCreated;

  public Account(int id, double balance, double annualInterestRate) {
    this.dateCreated = new Date();
    this.id = id;
    this.balance = balance;
    this.annualInterestRate = annualInterestRate;
  }

  public boolean withdraw(double amount) {
    if (this.balance >= amount) {
      this.balance -= amount;
      System.out.println("Withdraw Successful.");
      return true;
    } else {
      System.out.println("Withdraw Failure.");
      return false;
    }
  }

  public void deposit(double amount) {
    this.balance += amount;
    System.out.println("Deposit Successful");
  }

  public String printInfo() {
    String s = this.id + " " + this.balance + " " + this.annualInterestRate + " " + this.dateCreated;
    return s;
  }

  public int getId() {
    return this.id;
  }

  public double getBalance() {
    return this.balance;
  }

  public double getAnnualInterestRate() {
    return this.annualInterestRate;
  }

  public Date getDateCreated() {
    return this.dateCreated;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }
}
