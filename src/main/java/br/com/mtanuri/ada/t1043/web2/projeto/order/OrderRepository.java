package br.com.mtanuri.ada.t1043.web2.projeto.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  OrderRepository extends JpaRepository<OrderModel, Long> {
}
