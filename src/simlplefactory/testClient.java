package simlplefactory;

/**
 * Created by Administrator on 2015/5/6.
 */
public class testClient {

    public static void main(String[] args) {


        System.out.println(Factory.class.getResource(""));
        System.out.println(Factory.class.getClassLoader().getResource("/"));

        IApiInterface apitest = Factory.createApi();
        apitest.test("hzqiuxm");
    }

}
