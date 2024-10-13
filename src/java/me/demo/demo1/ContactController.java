package me.demo.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping
    public Contact addContact(@RequestBody Contact contact) {
        return contactRepository.save(contact); // Use JPA to save contact
    }

    @GetMapping
    public List<Contact> getContacts() {
        return contactRepository.findAll(); // Get all contacts
    }

    @PutMapping("/{id}")
    public Contact updateContact(@PathVariable Long id, @RequestBody Contact updatedContact) {
        updatedContact.setId(id); // Set ID
        return contactRepository.save(updatedContact); // Update contact
    }

    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable Long id) {
        contactRepository.deleteById(id); // Delete contact
    }
}
