package creational.prototype;

import java.util.List;

public class Statement implements Cloneable{

    private final String sql;
    private final List<String> parmeters;
    private final Record record;

    public Statement(String sql, List<String> parameters, Record record) {
        this.sql = sql;
        this.parmeters= parameters;
        this.record= record;
    }

    public Statement clone(){
        try {
            return (Statement) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return  null;
    }

    public String getSql() {
        return sql;
    }

    public List<String> getParmeters() {
        return parmeters;
    }

    public Record getRecord() {
        return record;
    }

}
