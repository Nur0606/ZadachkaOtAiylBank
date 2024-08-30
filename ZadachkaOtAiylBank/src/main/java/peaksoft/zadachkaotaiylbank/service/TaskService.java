package peaksoft.zadachkaotaiylbank.service;

import peaksoft.zadachkaotaiylbank.entity.Task;

import java.util.List;

public interface TaskService {
    //CRUD methods
    List<Task> getAllTasks();

    Task getTaskById(Long id);

    Task createTask(Task task);

    Task updateTask(Long id, Task taskDetails);

    void deleteTask(Long id);
}
