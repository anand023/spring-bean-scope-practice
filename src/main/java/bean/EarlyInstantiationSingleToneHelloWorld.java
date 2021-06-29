package bean;

public class EarlyInstantiationSingleToneHelloWorld {
    /**
     * Early Instantiation: creation of instance at load time.
     * During the class loading time it will create the object of this class
     * */
    private static EarlyInstantiationSingleToneHelloWorld instance= new EarlyInstantiationSingleToneHelloWorld();

    private String message;

    private EarlyInstantiationSingleToneHelloWorld(){}

    public static EarlyInstantiationSingleToneHelloWorld getInstance() {
        return instance;
    }

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message from Early Instantiation Singletone: " + message);
    }
}
