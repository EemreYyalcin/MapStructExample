package com.player.service;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public abstract class AService<T> {

    private final CrudRepository<T, String> repository;

    protected AService(CrudRepository<T, String> repository) {
        this.repository = repository;
    }

    public T save(T dto) {
        return repository.save(dto);
    }

    public T findById(String id) {
        Optional<T> licenseOptional = repository.findById(id);
        return licenseOptional.orElse(null);
    }

    public List<T> findAll() {
        Iterable<T> iterable = repository.findAll();
        List<T> list = new ArrayList<>();
        if (Objects.isNull(iterable)) {
            return list;
        }
        iterable.iterator().forEachRemaining(list::add);
        return list;
    }

}
