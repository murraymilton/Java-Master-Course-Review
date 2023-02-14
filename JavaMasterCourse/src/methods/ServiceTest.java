package methods;

public class ServiceTest {
    private String serviceId;

    public static void main(String[]args){
        ServiceTest serviceTest = new ServiceTest();

        System.out.println(serviceTest.getServiceId());
    }

    public String getServiceId(){
        return generateServiceId();
    }
    private String generateServiceId(){
       String serviceId = "1111";
       return serviceId;
    }
}
