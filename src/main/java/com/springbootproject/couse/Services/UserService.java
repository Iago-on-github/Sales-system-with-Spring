package com.springbootproject.couse.Services;

import com.springbootproject.couse.Entities.User;
import com.springbootproject.couse.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //diz ao Spring que esta é uma classe de serviço
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);

        return obj.get(); //a operação "get()" retorna o objeto do tipo que estiver dentro de obj.
    }
}
