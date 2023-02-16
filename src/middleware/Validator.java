package middleware;

public class Validator {

    public static void validate(Object object){
        if(object == null){
            throw new NullPointerException();
        }
        else if(object instanceof String && ((String)object).isEmpty()){
            throw new RuntimeException("Пустая строка");
        }
    }
}
