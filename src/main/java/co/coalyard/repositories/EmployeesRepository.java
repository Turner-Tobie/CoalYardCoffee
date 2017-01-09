package co.coalyard.repositories;

import org.springframework.data.repository.CrudRepository;

import co.coalyard.beans.Employees;

public interface EmployeesRepository extends CrudRepository<Employees, Long>{

}
