package de.proj.Kraueterlehrpfad.repository;

import de.proj.Kraueterlehrpfad.Entity.QRCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QRCodeRepository extends JpaRepository<QRCode, Integer> {
    public QRCode findByIdentifier(String identifier);

}
