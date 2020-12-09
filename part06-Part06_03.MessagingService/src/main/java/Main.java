
public class Main {

    public static void main(String[] args) {
        Message test = new Message("testsender", "testcontent");
        MessagingService service = new MessagingService();
        
        service.add(test);
        
        System.out.println(service.getMessages());
        
    }
}
