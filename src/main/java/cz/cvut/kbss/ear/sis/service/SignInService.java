package cz.cvut.kbss.ear.sis.service;

import cz.cvut.kbss.ear.sis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.logging.Logger;

@Service
public class SignInService {
    private static final Logger log = Logger.getLogger(SignInService.class.getName());
    private final UserService userService;
    private User loggedUser;

    @Autowired
    public SignInService(UserService userService) {
        this.userService = userService;
    }


}
