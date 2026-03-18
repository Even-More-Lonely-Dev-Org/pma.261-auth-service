package store.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import insper.store.account.AccountController;
import insper.store.account.AccountIn;

@Service
public class AuthService {

    @Autowired
    private AccountController accountController;

    public void register(RegisterIn in){
        
        //record the input into account
        accountController.create(AccountIn.builder()
            .name(in.name())
            .email(in.email())
            .password(in.password())
            .build()
        ).getBody();
    }
        

}