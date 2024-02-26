package GramPanchayat.service;


import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import GramPanchayat.model.BirthData;
import GramPanchayat.repository.BirthDataRepo;


 
@Service
@Transactional
public class UserServices {
     
    @Autowired
    private BirthDataRepo repo;
     
    public List<BirthData> listAll() {
        return repo.findAll(Sort.by("fullname").ascending());
    }
    
 
//    public List<BirthData> listAll() {
//        return repo.findAll(Sort.by("email").ascending());
//    }
    
    
    public BirthData getId(Integer b)
    {
    	return repo.getById(b);
    }
    
    
   
}