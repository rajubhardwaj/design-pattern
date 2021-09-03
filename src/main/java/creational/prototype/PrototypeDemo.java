package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {

    public static void main(String[] args) {
        String sql ="select * from movies where title= ?";
        List<String> parameters = new ArrayList<>();
        parameters.add("Star wars");
        Record record = new Record();
        Statement firstStatement = new Statement(sql, parameters,record);

        System.out.println(firstStatement.getSql());
        System.out.println(firstStatement.getParmeters());
        System.out.println(firstStatement.getRecord());

        Statement secondStatement = new Statement(sql, parameters,record);

        System.out.println(secondStatement.getSql());
        System.out.println(secondStatement.getParmeters());
        System.out.println(secondStatement.getRecord());


    }
}
