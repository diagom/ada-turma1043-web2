package br.com.mtanuri.ada.t1043.web2.projeto.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Order")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderServiceImpl orderService){
        this.orderService = orderRepository;
    }

    @PostMapping
    public OrderModel addOrder(@RequestBody OrderModel orderModel){
        return orderService.save(orderModel);
    }


    @GetMapping()
    public List<OrderModel> getOrder(){
        return orderService.findAll();
    }
}