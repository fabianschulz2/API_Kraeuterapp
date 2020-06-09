package de.proj.Kraueterlehrpfad.repository;

import de.proj.Kraueterlehrpfad.Entity.QRKraeuterLink;
import de.proj.Kraueterlehrpfad.ID.QRKraeuterLinkID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QRKraeuterLinkRepository extends JpaRepository<QRKraeuterLink, QRKraeuterLinkID> {
}
