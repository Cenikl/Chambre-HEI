package com.spring.project.repository;

import com.spring.project.model.Customer;
import com.spring.project.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String> {
    @Query(value = "update customer set room = ?1 where id like ?2",nativeQuery = true)
    Customer updateRoom(Room room, String customerId);
}
