public class money {



    String Firstname;
    String Lastname;
   
       money(){
        this.Firstname = "money";
       this.Lastname = " ritik";

       }
       money(String m , String n){
        this.Firstname = m;
        this.Lastname = n;
       }
      
    
    public static void main(String args[]){
        money ob1 = new money();
        System.out.println(ob1.Firstname + ob1.Lastname );
        money ob2 = new money("meraj","alam");
        System.out.println(ob2.Firstname + ob2.Lastname );




















        void animal(){
            System.out.println("Animal");
        }
    }
    
}
