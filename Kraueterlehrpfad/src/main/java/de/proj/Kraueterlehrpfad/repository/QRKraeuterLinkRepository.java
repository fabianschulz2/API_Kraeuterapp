package de.proj.Kraueterlehrpfad.repository;

import de.proj.Kraueterlehrpfad.Entity.Kraut;
import de.proj.Kraueterlehrpfad.Entity.QRKraeuterLink;
import de.proj.Kraueterlehrpfad.ID.QRKraeuterLinkID;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QRKraeuterLinkRepository extends JpaRepository<QRKraeuterLink, Integer> {


}
