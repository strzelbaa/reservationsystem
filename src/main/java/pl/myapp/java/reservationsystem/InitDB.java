package pl.myapp.java.reservationsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.myapp.java.reservationsystem.domain.guest.GuestService;

@Component
public class InitDB implements CommandLineRunner {

    @Autowired
    GuestService guestService;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("------ INIT GUEST DATABASE -------");
        guestService.createNewGuest("Adam", "Nowak", 30);

        System.out.println("------CURENT GUEST COUNT: " + guestService.getAll().size());
    }
}
