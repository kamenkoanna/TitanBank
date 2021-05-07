package com.kamenko.service;

import java.security.Principal;

import com.kamenko.domain.PrimaryAccount;
import com.kamenko.domain.SavingsAccount;

public interface AccountService {
	
    PrimaryAccount createPrimaryAccount();
    
    SavingsAccount createSavingsAccount();
    
    void deposit(String accountType, double amount, Principal principal);
    
    void withdraw(String accountType, double amount, Principal principal);
    
}
