class Lab544{

public static void main(String arg[]){


Customer c1=new Customer();
c1.show();

Customer c2=new Customer();
c2.id=20;
c2.name="srinivas";
c2.phone=1212332;
c2.show();;


}
}


class Customer{

int id;
String name;
long phone;
public void show(){
System.out.println("The data in the customer classs:"+id+"name"+name+""+phone);
}

}