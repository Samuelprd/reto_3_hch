package com.example.reto_3_hch.repository;


import com.example.reto_3_hch.entities.Library;
import com.example.reto_3_hch.repository.CrudRepository.LibraryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class LibraryRepository {

    @Autowired
    private LibraryCrudRepository libraryCrudRepository;

    public List<Library> getAll(){
        return (List<Library>) libraryCrudRepository.findAll();
    }
    public Optional<Library> getLibrary(int id){
        return libraryCrudRepository.findById(id);
    }
    public Library save(Library p){
        return libraryCrudRepository.save(p);
    }
    public void delete(Library p){
        libraryCrudRepository.delete(p);
    }
}
