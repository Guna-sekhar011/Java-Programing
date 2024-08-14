import java.util.Scanner;

class Encapsulation{
    private int id;
    private String name;
    private String email;
    private int phone;
    private int password;
    private String address;
    
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhone(int phone){
        this.phone = phone;
    }

    public void SetPassword(int password){
        this.password = password;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void getId(){
        System.out.println("Id : "+ id);
    }

    public void getName(){
        System.out.println("Name : "+ name);
    }

    public void getEmail(){
        System.out.println("Email : "+ email);
    }

    public void getPhone(){
        System.out.println("Phone : "+ phone);
    }

    public void getPassword(){
        System.out.println("Password : "+ password);
    }

    public void getAddress(){
        System.out.println("Address : "+ address);
    }

}

class Test{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter id");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Name ");
        String name = scan.nextLine();
    
        System.out.println("Enter Email ");
        String email = scan.nextLine();
        
        System.out.println("Enter Phone");
        int phone = scan.nextInt();
        System.out.println("Enter Password");
        int password = scan.nextInt();
        System.out.println("Enter Address");
        scan.nextLine();
        String address = scan.nextLine();

        Encapsulation e = new Encapsulation();
        e.setId(id);
        e.setName(name);
        e.setEmail(email);
        e.setPhone(phone);
        e.SetPassword(password);
        e.setAddress(address);

        e.getId();
        e.getName();
        e.getEmail();
        e.getPhone();
        e.getPassword();
        e.getAddress();

    }
}