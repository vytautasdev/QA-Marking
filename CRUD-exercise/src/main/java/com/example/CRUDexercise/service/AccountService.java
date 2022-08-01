package com.example.CRUDexercise.service;

//import com.example.CRUDexercise.model.Account;
import com.example.CRUDexercise.model.Account;
import com.example.CRUDexercise.model.AccountDTO;
import com.example.CRUDexercise.repository.AccountRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountService {

    private AccountRepository accountRepository;


    private ModelMapper mapper;

    public AccountService(AccountRepository accountRepository, ModelMapper mapper) {
        this.accountRepository = accountRepository;
        this.mapper = mapper;
    }

    private AccountDTO mapToDTO(Account account) {
        return mapper.map(account, AccountDTO.class);
    }

    public AccountDTO addAccount(Account account) {
        var saved = accountRepository.save(account);
        return mapToDTO((Account) saved);
    }

    public List<AccountDTO> getAllAccounts() {
        return accountRepository.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    public AccountDTO updateAccount(Long id, Account account) {
        var existingOptional = accountRepository.findById(id);
        var existing = existingOptional.get();

        existing.setName(account.getName());
        existing.setAccNumber(account.getAccNumber());

        var updated = accountRepository.save(existing);
        return mapToDTO(updated);
    }

    public boolean removeAccount(Long id) {
        accountRepository.deleteById(id);
        var exists = accountRepository.existsById(id);
        return !exists;
    }

    public List<AccountDTO> getAccountByName(String name) {
        return accountRepository.findAccountByName(name);
    }
}
