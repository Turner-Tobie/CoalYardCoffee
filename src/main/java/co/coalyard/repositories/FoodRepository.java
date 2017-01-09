package co.coalyard.repositories;

import org.springframework.data.repository.CrudRepository;

import co.coalyard.beans.Food;

public interface FoodRepository extends CrudRepository<Food, Long>{

}
