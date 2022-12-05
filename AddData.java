package com.project.SpringMVC1Project;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddData extends CrudRepository<Staff,Integer>
{

}