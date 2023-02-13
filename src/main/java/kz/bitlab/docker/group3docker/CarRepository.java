package kz.bitlab.docker.group3docker;

import kz.bitlab.docker.group3docker.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CarRepository extends JpaRepository<Car, Long> {
}
