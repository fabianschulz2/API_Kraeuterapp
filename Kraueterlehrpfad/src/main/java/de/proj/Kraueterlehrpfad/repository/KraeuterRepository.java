package de.proj.Kraueterlehrpfad.repository;

import com.sun.istack.NotNull;
import de.proj.Kraueterlehrpfad.Entity.Kraeuter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface KraeuterRepository extends JpaRepository<Kraeuter, Integer> {


}
