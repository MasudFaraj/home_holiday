package org.cammbs_up.holidayhome.repository;

import org.cammbs_up.holidayhome.modal.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepo extends JpaRepository<Home, Integer> {

    Home findByIdAccommodation(int id);

    Home findByIdHome(int id);
}
