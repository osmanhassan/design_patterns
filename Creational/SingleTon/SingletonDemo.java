public class SingletonDemo{

    public static void main(String[]args){
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.setMessage("Hello Java");
        System.out.println(singleObject.getMessage());
    }

}