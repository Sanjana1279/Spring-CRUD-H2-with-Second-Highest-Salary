package second_highest.service;

import second_highest.entity.User;
import second_highest.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User saveUser(User user) {
        return repo.save(user);
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public User getUserById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public String deleteUser(Long id) {
        repo.deleteById(id);
        return "User deleted with id " + id;
    }

    public User updateUser(Long id, User user) {
        User existing = repo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(user.getName());
            existing.setSalary(user.getSalary());
            return repo.save(existing);
        }
        return null;
    }

    public Double getSecondHighestSalary() {
        return repo.findSecondHighestSalary();
    }
}
