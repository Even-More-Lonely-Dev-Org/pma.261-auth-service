package store.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import insper.store.account.AccountOut;

@RestController
public class AuthResource implements AuthController {

    @Autowired
    private AuthService authService;

    @Override
    public ResponseEntity<TokenOut> login(LoginIn in) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResponseEntity<Void> register(RegisterIn in) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResponseEntity<AccountOut> whoIAm() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ResponseEntity<Void> healthCheck() {
        // TODO Auto-generated method stub
        return null;
    }

}