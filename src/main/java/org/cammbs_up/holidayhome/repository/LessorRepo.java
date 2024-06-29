package org.cammbs_up.holidayhome.repository;

import org.cammbs_up.holidayhome.modal.Lessor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessorRepo extends JpaRepository<Lessor, Integer> {
}
