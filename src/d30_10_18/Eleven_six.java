package d30_10_18;

import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Eleven_six {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        list.add(new Loan());
        list.add(new Date());
        list.add("random text");
        list.add(new Circle());

        for(Object o:list){
            System.out.println(o.toString());
        }

    }
}
