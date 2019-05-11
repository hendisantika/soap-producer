package com.hendisantika.soapproducer.endpoint;

import com.hendisantika.soapproducer.GetUserDetailsRequest;
import com.hendisantika.soapproducer.GetUserDetailsResponse;
import com.hendisantika.soapproducer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by IntelliJ IDEA.
 * Project : soap-producer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-11
 * Time: 09:30
 */
@Endpoint
public class UserServiceEndpoint {

    private final String NAMESPACE = "https://www.hendisantika.com/UserService";

    @Autowired
    private UserRepository userRepository;

    @PayloadRoot(namespace = NAMESPACE, localPart = "getUserDetailsRequest")
    @ResponsePayload
    public GetUserDetailsResponse getUser(@RequestPayload final GetUserDetailsRequest request) {
        GetUserDetailsResponse response = new GetUserDetailsResponse();
        response.getUsers().addAll(userRepository.getUsers(request.getName()));
        return response;
    }

}