package pl.myapp.java.reservationsystem.domain.guest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000")
public class GuestController {

    @Autowired
    GuestService guestService;

    @GetMapping("guests")
    public List<Guest> getAllGuests() {
        return guestService.getAll();
    }

    @GetMapping("/guests/{id}")
    public Guest getGuest(@PathVariable Long id) {
        return guestService.getGuestById(id);
    }

    @PostMapping("/guests")
    public void createGuest(@RequestBody Guest guest) {
        guestService.createNewGuest(guest);
    }

    @DeleteMapping("/guests/{id}")
    public void deleteGuest(@PathVariable Long id) {
        guestService.remove(id);
    }

    @PutMapping("/guest/{id}")
    public void updateGuest(@PathVariable Long id, @RequestBody Guest guest ){
        this.guestService.updateGuest(id, guest);
    }

}
