package peaksoft.zadachkaotaiylbank.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import peaksoft.zadachkaotaiylbank.entity.Task;
import peaksoft.zadachkaotaiylbank.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
@Tag(name = "Task-API")

public class TaskAPI {
    private final TaskService taskService;

    @GetMapping("/getAll")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/getById")
    public Task getTaskById(@RequestParam Long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping("/save")
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PutMapping("/update")
    public Task updateTask(@RequestParam Long id, @RequestBody Task taskDetails) {
        return taskService.updateTask(id, taskDetails);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteTask(@RequestParam Long id) {
        taskService.deleteTask(id);
        return ResponseEntity.noContent().build();
    }
}

