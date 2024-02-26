package GramPanchayat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import GramPanchayat.model.BirthData;

@Repository
public interface BirthDataRepo extends JpaRepository<BirthData, Integer>{

}
