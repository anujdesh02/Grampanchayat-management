package GramPanchayat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import GramPanchayat.model.Marriege;

@Repository
public interface MarriegeRepo extends JpaRepository<Marriege, Integer>{

}
