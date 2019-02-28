package com.player.repo;

import com.player.db.model.Nationality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalityRepository extends CrudRepository<Nationality, String> {
}
