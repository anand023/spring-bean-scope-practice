package bean;

public class LazyInstantiationSingleToneHelloWorld {

    private static LazyInstantiationSingleToneHelloWorld instance=null;

    private String message;

    private LazyInstantiationSingleToneHelloWorld() {
    }

    /**
     * Lazy Instantiation: creation of instance when required.
     * when this class will be called then only it will crate the object of this class
     * */
    public static LazyInstantiationSingleToneHelloWorld getInstance() {
        if (instance == null){
            instance=new LazyInstantiationSingleToneHelloWorld();
        }
        return instance;
    }

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message from Lazy Instantiation Singletone : " + message);
    }
}
