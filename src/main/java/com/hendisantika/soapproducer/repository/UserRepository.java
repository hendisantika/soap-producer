package com.hendisantika.soapproducer.repository;

import com.hendisantika.soapproducer.Address;
import com.hendisantika.soapproducer.AddressType;
import com.hendisantika.soapproducer.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : soap-producer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-11
 * Time: 09:07
 */
@Component
public class UserRepository {

    private List<User> users = new ArrayList<User>();

    public UserRepository() {
        User u1 = new User();
        u1.setId(1);
        u1.setName("Uzumaki Naruto");
        u1.setEmail("uzumaki_naruto@email.com");
        Address a1 = new Address();
        a1.setStreet("Konohagakure");
        a1.setCity("Konohagakure");
        a1.setState("KNH");
        a1.setCountry("Jepang");
        a1.setZip(700030);
        a1.setAddressType(AddressType.COMMUNICATION);
        u1.setAddress(a1);

        User u2 = new User();
        u2.setId(2);
        u2.setName("Uchiha Sasuke");
        u2.setEmail("uchiha_sasuke@email.com");
        Address a2 = new Address();
        a2.setStreet("Birati");
        a2.setCity("Konohagakure");
        a2.setState("KNH");
        a2.setCountry("Jepang");
        a2.setZip(700130);
        a2.setAddressType(AddressType.COMMUNICATION);
        u2.setAddress(a2);

        User u3 = new User();
        u3.setId(3);
        u3.setName("Gaara");
        u3.setEmail("gaara@email.com");
        Address a3 = new Address();
        a3.setStreet("Sunagakure");
        a3.setCity("Sunagakure");
        a3.setState("SNG");
        a3.setCountry("Jepang");
        a3.setZip(700150);
        a3.setAddressType(AddressType.COMMUNICATION);
        u3.setAddress(a3);

        User u4 = new User();
        u4.setId(4);
        u4.setName("Momochi Zabusa");
        u4.setEmail("momochi_zabusa@email.com");
        Address a4 = new Address();
        a4.setStreet("Kirigakure");
        a4.setCity("Mizukuni");
        a4.setState("MZK");
        a4.setCountry("Jepang");
        a4.setZip(700098);
        a4.setAddressType(AddressType.COMMUNICATION);
        u4.setAddress(a4);

        User u5 = new User();
        u5.setId(5);
        u5.setName("Killer Bee");
        u5.setEmail("killer_bee@email.com");
        Address a5 = new Address();
        a5.setStreet("Kumogakure");
        a5.setCity("Raigakure");
        a5.setState("RGK");
        a5.setCountry("Jepang");
        a5.setZip(400091);
        a5.setAddressType(AddressType.COMMUNICATION);
        u5.setAddress(a5);

        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);
    }

    public List<User> getUsers(String name) {
        List<User> userList = new ArrayList<>();
        for (User user : users) {
            if (user.getName().toLowerCase().contains(name.toLowerCase())) {
                userList.add(user);
            }
        }
        return userList;
    }

}