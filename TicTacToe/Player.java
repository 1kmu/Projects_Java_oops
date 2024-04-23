package player;

public class Player {
    private String name;
    private char symbol;
    private String address;
    private String contactNum;
    private String email ;
    private int age ;

    public void  setPlayerDetails(String name , char symbol , String address , String contactNum ,String email, int age){
        this.name = name;
        this.symbol = symbol;
        this.address = address;
        this.contactNum = contactNum;
        this.email = email;
        this.age = age;
    }

    public void  setPlayerNameandSymbol(String name , char symbol){
        this.name = name;
        this.symbol = symbol;
    }

    public void changeSymbol(char symbol){
        this.symbol = symbol;
    }

    public void setPlayerNameAndSymbol(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getPlayerName(){
        return this.name;
    }
    public char getPlayerSymvol(){
        return this.symbol;
    }
    public void getPlayerNameAndSymbol() {
        System.out.println("Player Name: " + this.name);
        System.out.println("Player Symbol: " + this.symbol);
    }
    public void getPlayerDetails(){
        System.out.println("Player name : "+ this.name);
        System.out.println("Player symbol :"+this.symbol);
        System.out.println("Player adress :"+this.address);
        System.out.println("Player conatct : "+ this.contactNum);
        System.out.println("Player email :"+this.email);
        System.out.println("Player age :"+this.age);
    }

}
