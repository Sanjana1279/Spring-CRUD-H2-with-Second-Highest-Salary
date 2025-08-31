package second_highest.repository;

import second_highest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Native query to get 2nd highest salary
    @Query(value = "SELECT DISTINCT salary FROM users ORDER BY salary DESC LIMIT 1 OFFSET 1", nativeQuery = true)
    Double findSecondHighestSalary();
}
