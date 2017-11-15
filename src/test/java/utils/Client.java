package utils;


public class Client {
    private String nom;
    private Account account;



    public Client(String nom){
         this.nom = nom;
    }


    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
