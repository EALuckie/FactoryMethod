public class DB_MySQL extends AbstractDB {
    public DB_MySQL(){

    }
    //
    @Override
    public String connect_db(){
        return "Connected to MySQL...";
    }//
    @Override
    public String disconnect_db(){
        return "Disconnected from MySQL";
    }
}
