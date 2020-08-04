package de.proj.Kraueterlehrpfad.repository;


import de.proj.Kraueterlehrpfad.Entity.Point_ohneJoin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Point_ohneJoinRepository extends JpaRepository<Point_ohneJoin, Integer> {
}
