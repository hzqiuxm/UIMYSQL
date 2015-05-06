package simlplefactory;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Administrator on 2015/5/6.
 */
public class Factory {

    public static IApiInterface createApi(){

        IApiInterface api = null;
        Properties properties = new Properties();
        InputStream ips = null;

//        ips = Factory.class.getResourceAsStream("FactortTest.properties");
        try {
            ips = Factory.class.getResourceAsStream("FactoryTest.properties");

                    properties.load(ips);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("load file error ......");
        }
        finally {
            try {
                ips.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            api = (IApiInterface)Class.forName(properties.getProperty("ImplClass")).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return api;

    }
}
