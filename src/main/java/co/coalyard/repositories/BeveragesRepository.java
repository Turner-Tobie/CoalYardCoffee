package co.coalyard.repositories;

import org.springframework.data.repository.CrudRepository;

import co.coalyard.beans.Beverages;

public interface BeveragesRepository extends CrudRepository<Beverages, Long>{

}
