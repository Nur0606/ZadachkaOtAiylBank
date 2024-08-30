package peaksoft.zadachkaotaiylbank.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.zadachkaotaiylbank.entity.Task;
import peaksoft.zadachkaotaiylbank.exception.TaskNotFoundException;
import peaksoft.zadachkaotaiylbank.repo.TaskRepository;
import peaksoft.zadachkaotaiylbank.service.TaskService;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;
    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException("Task not found with id: " + id));
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Long id, Task taskDetails) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new TaskNotFoundException(String.format("User with id %d not found", id)));
        task.setDescription(taskDetails.getDescription());
        task.setCompleted(taskDetails.isCompleted());
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new TaskNotFoundException(String.format("User with id %d not found", id)));
        taskRepository.deleteById(task.getId());
    }
}
