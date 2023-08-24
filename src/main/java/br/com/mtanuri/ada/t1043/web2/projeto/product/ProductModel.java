package br.com.mtanuri.ada.t1043.web2.projeto.product;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "order_registration")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
