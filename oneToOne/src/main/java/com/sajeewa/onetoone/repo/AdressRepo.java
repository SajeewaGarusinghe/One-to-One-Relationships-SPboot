package com.sajeewa.onetoone.repo;

import com.sajeewa.onetoone.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressRepo extends JpaRepository<Address, Long> {
}
