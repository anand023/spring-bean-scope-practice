import bean.EarlyInstantiationSingleToneHelloWorld;

import java.lang.reflect.Constructor;

public class CallPrivateConstuctor {
    public static void main(String[] args) {
        try{
            Class c= Class.forName("bean.EarlyInstantiationSingleToneHelloWorld"); // EarlyInstantiationSingleToneHelloWorld - className
            Constructor c1[]=c.getDeclaredConstructors();
            c1[0].setAccessible(true);
            EarlyInstantiationSingleToneHelloWorld a= (EarlyInstantiationSingleToneHelloWorld)c1[0].newInstance();

            a.getMessage();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
