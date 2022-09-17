package mate.academy.spring.service;

import mate.academy.spring.model.Role;
import mate.academy.spring.model.User;

import java.util.Set;

public interface AuthenticationService {
    User register(String email, String password, Set<Role> roles);
}
