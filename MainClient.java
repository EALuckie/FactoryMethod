public class MainClient {
    public static void main (String []args){
        DBoperation mysql=Factory.connectDB("mysql");
        System.out.println(mysql.connect_db());
        System.out.println(mysql.disconnect_db());
        System.out.println();
        
                
        DBoperation oracle=Factory.connectDB("oracle");
        System.out.println(oracle.connect_db());
        System.out.println(oracle.disconnect_db());
        System.out.println();
    }
}
