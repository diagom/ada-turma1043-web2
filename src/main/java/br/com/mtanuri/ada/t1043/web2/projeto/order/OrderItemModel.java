package br.com.mtanuri.ada.t1043.web2.projeto.order;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import br.com.mtanuri.ada.t1043.web2.projeto.product.ProductModel;

@Entity
@Table(name = "order_item_registration")
@Data
public class OrderItemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderModel orderId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductModel productId;

    private Integer amount;
    private BigDecimal price;
    private BigDecimal discount;
}

