package com.gguilhermelopes.webservices.services;

import com.gguilhermelopes.webservices.entities.Category;
import com.gguilhermelopes.webservices.entities.User;
import com.gguilhermelopes.webservices.repositories.CategoryRepository;
import com.gguilhermelopes.webservices.services.exceptions.DatabaseException;
import com.gguilhermelopes.webservices.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);

        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public Category insert (Category obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        Optional<Category> obj = repository.findById(id);
        if(obj.isEmpty())
            throw new ResourceNotFoundException(id);
        try {
            repository.deleteById(obj.get().getId());
        } catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
    }

    public Category update(Long id, Category obj){
        try {
            Category entity = repository.getReferenceById(id);
            updateData(entity, obj);
            return repository.save(entity);
        } catch (EntityNotFoundException e){
            throw new ResourceNotFoundException(id);
        }

    }

    private void updateData(Category entity, Category obj) {
        entity.setName(obj.getName());
    }

}
