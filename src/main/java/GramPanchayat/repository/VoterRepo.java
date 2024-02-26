package GramPanchayat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import GramPanchayat.model.Voter;

@Repository
public interface VoterRepo extends JpaRepository<Voter, Integer>{

}
