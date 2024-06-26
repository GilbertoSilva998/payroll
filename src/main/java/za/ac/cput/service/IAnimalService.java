package za.ac.cput.service;

import za.ac.cput.domain.Animal;

import java.util.List;

public interface IAnimalService extends IService<Animal, Long>{
    List<Animal> getAll();
}
