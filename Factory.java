public class Factory {
    public static AbstractDB connectDB(String database){
        if(Objects.equals(name,"mysql"))
            return new DB_MySQL();       
        else if (Objects.equals(name,"oracle"))
            return new DB_Oracle();
        else
            return "Couldn't connect :(";
    }
}
