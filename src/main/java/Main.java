
import java.io.IOException;
import java.net.URI;

public class Main {
    public static final URI URI_LINK = URI.create("https://jsonplaceholder.typicode.com/users");

    public static void main(String[] args) throws IOException, InterruptedException {
        final Company company = new Company("Pawtucket Patriot", "best worst beer", "Quahog's Brewery");
        final Geo geo = new Geo(12.123, 16.221);
        final Address address = new Address("spoon str", "8", "Quahog", "02232", geo);
        final User user = new User("Peter Griffin","manchkin666", "manchkin666@gmail.com", address, "380991112233", "familyguy.com", company);

        Service service = new Service();
        service.getAllUsersInfo(URI_LINK);
        service.addUser(URI_LINK, user);
    }
}
