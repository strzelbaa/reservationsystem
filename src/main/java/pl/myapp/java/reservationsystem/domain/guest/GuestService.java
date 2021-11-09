package pl.myapp.java.reservationsystem.domain.guest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    @Autowired
    GuestRepository repository;

    public void createNewGuest(String firstname, String lastname, int age) {
        Guest newOne = new Guest(firstname, lastname, age);
        repository.create(newOne);
    }

    public List<Guest> getAll() {
        return repository.getAll();
    }

    public Guest getGuestById(long id) {
        return this.repository.findById(id);
    }

    public void createNewGuest(Guest guest) {
        this.repository.create(guest);
    }

    public void remove(Long id) {
        Guest guest = this.repository.findById(id);
        this.repository.delete(guest);
    }

    public void updateGuest(Long id, Guest guest) {
        Guest existing = this.repository.findById(id);
        if(existing==null) {
            this.repository.create(guest);
        } else {
            guest.setId(existing.getId());
            this.repository.update(guest);
        }
    }
}
