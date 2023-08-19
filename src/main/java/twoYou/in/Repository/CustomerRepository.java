package twoYou.in.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import twoYou.in.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
