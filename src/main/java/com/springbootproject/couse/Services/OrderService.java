package com.springbootproject.couse.Services;

import com.springbootproject.couse.Entities.Order;
import com.springbootproject.couse.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service //diz ao Spring que é uma classe de serviços
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = orderRepository.findById(id);

        return obj.get();
    }
}
