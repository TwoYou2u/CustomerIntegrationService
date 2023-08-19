package twoYou.in.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import twoYou.in.Entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
