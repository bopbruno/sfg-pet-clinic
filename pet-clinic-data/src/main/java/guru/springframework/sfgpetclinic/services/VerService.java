package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;
import java.util.Set;

public interface VerService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
