package co.coalyard.repositories;

import org.springframework.data.repository.CrudRepository;

import co.coalyard.beans.Band;

public interface BandRepository extends CrudRepository<Band, Long>{

}
