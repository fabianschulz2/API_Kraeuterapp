package de.proj.Kraueterlehrpfad.repository;

import de.proj.Kraueterlehrpfad.entity.QRCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QRCodeRepository extends JpaRepository<QRCode, Integer> {
    public QRCode findByIdentifier(String identifier);

}
