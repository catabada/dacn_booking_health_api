package vn.edu.hcmuaf.fit.dacn_booking_health_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IRepository<T> extends JpaRepository<T, Long> {
    List<T> findAll();

    Optional<T> findById(long id);

    T save(Object entity);

    void delete(T entity);

}
