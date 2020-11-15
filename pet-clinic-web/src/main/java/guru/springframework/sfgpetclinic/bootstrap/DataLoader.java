package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.map.OwnerServiceMap;
import guru.springframework.sfgpetclinic.map.VetServiceMap;
import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();

        owner1.setId(1L);
        owner1.setFirstName("John");
        owner1.setLastName("Smith");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Michael");
        owner2.setLastName("Ruth");

        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setId(3L);
        owner3.setFirstName("Kyle");
        owner3.setLastName("Broflowsky");

        ownerService.save(owner3);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Amanda");
        vet1.setLastName("Stonebreaker");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet1.setId(2L);
        vet2.setFirstName("Julia");
        vet2.setLastName("Rogers");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
