package peaksoft.zadachkaotaiylbank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import peaksoft.zadachkaotaiylbank.entity.Task;
@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
}
