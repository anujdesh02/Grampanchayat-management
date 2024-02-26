package GramPanchayat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import GramPanchayat.model.DeathData;

@Repository
public interface DeathRepo extends JpaRepository<DeathData, Integer>{

}
