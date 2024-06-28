package org.cammbs_up.holidayhome.repository;

import org.cammbs_up.holidayhome.modal.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepo extends JpaRepository<Price, Integer> {
}
