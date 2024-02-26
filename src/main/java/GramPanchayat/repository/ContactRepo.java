package GramPanchayat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import GramPanchayat.model.ContactData;

@Repository
public interface ContactRepo extends JpaRepository<ContactData, Integer>{
}
