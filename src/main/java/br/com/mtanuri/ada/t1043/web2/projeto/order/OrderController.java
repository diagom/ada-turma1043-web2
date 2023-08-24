package br.com.mtanuri.ada.t1043.web2.projeto.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Order")
public class OrderController {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderController(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    @PostMapping
    public OrderModel addOrder(@RequestBody OrderModel orderModel){
        return orderRepository.save(orderModel);
    }


    @GetMapping()
    public List<OrderModel> getOrder(){
        return orderRepository.findAll();
    }
}