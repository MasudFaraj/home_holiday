package org.cammbs_up.holidayhome.repository;

import org.cammbs_up.holidayhome.modal.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomeRepo extends JpaRepository<Home, Integer> {

    Home findByIdAccommodation(int id);
    Home deleteById( int id);

    List<Home> findByAccommodationNameContaining(String infix);
}
