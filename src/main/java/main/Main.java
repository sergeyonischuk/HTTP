package main;

import entities.Address;
import entities.Company;
import entities.Geo;
import entities.User;
import utills.Service;

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
//        service.getAllUsersInfo(URI_LINK);
//        service.addUser(URI_LINK, user);
//        entities.User user1 = service.getUserByID(10);
//        System.out.println(user1);
//        entities.User user2 = service.getUserByUsername("Elwyn.Skiles");
//        System.out.println(user2);
//        service.deleteUser(4);
//        user.setWebsite("fox.com");
//        service.updateUser(user);
        System.out.println(service.getUncompletedUserTasks(10).size());
    }
}
