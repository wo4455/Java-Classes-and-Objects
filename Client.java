import java.util.ArrayList;

public class Client {
  private int id;
  private String name;
  private String phone;

  private ArrayList<Account> accounts;

  public Client(int id, String name, String phone) {
    this.id = id;
    this.name = name;
    this.phone = phone;

    accounts = new ArrayList<Account>();
  }

  public boolean addAccount(Account account) {
    if (accounts.size() < 5) {
      accounts.add(account);
      System.out.println("Account added.");
      return true;
    } else {
      System.out.println("Account could not be added.");
      return false;
    }
  }

  public boolean removeAccount(int accountId) {
    for (int i = 0; i < accounts.size(); i++) {
     if (accounts.get(i).getId() == accountId) {
       accounts.remove(accounts.get(i));
       System.out.println("Account removed.");
       return true;
     } else {
       System.out.println("Could not remove account.");
     }
    }
    return false;
  }

  public String printInfo() {
    String s = this.name + " " + this.phone + " " + this.id + " " + "\n";

    for (int i = 0; i < accounts.size(); i++) {
      s += accounts.get(i).printInfo() + "\n";
    }
    return s;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
