package simlplefactory;

/**
 * Created by Administrator on 2015/5/6.
 */
public class APiImpl2 implements IApiInterface{
    @Override
    public void test(String name) {

        System.out.println("Welcome, " + name + " NOW YOU ARE IN API 2 !");
    }
}
