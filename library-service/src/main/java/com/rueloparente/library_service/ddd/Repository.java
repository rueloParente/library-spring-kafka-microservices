package com.rueloparente.library_service.ddd;

import java.util.Optional;

//Generic CRUD operations for a repository, specifying type of AggregateRoot and DomainID
//This interface helps to implement the Dependency Inversion Principle and Clean Architecture

public interface Repository<T extends AggregateRoot, ID extends DomainID> {
    Optional<T> findById(ID id);
    T save(T entity);
    void delete(T entity);
}
