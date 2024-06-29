package org.cammbs_up.holidayhome.repository;

import org.cammbs_up.holidayhome.modal.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepo extends JpaRepository<Price, Integer> {
}
