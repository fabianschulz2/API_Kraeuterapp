package de.proj.Kraueterlehrpfad.repository;

import de.proj.Kraueterlehrpfad.entityx.Point;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointRepository extends JpaRepository<Point, Integer> {
}
