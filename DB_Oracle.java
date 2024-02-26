public class DB_Oracle {
    public DB_Oracle (){}
    //
    @Override
    public String connect_db(){
        return "Connected to Oracle";
    }
    //
    @Override
    public String disconnect_db(){
        return "Disconnected from Oracle";
    }
}
