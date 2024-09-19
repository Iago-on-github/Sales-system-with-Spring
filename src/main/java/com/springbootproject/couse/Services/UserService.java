package com.springbootproject.couse.Services;

import com.springbootproject.couse.Entities.User;
import com.springbootproject.couse.Repositories.UserRepository;
import com.springbootproject.couse.Services.Exceptions.DatabaseException;
import com.springbootproject.couse.Services.Exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
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

        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User user) {
        return repository.save(user);
    }

    public User update(Long id, User obj) {
        try {
           User user = repository.getReferenceById(id);
           updateData(user, obj);
           return repository.save(user);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(e.getMessage());
        }
    }

    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException(id);
        }
        try {
            repository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    private void updateData(User user, User userUpdate) {
        user.setName(userUpdate.getName());
        user.setEmail(userUpdate.getEmail());
        user.setPhone(userUpdate.getPhone());
    }
}
