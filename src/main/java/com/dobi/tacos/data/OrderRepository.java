package com.dobi.tacos.data;

import com.dobi.tacos.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
//    Order save(Order order);
}
