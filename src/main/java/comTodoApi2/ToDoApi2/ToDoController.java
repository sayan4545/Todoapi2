package comTodoApi2.ToDoApi2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ToDoController {

    private static List<ToDo> todos;
    public ToDoController(){
        todos = new ArrayList<>();
        todos.add(new ToDo(1,false,"Todo 1",1));
        todos.add(new ToDo(2,true,"Todo 2",10));



    }
    @GetMapping("/getTodo")
    public ResponseEntity<List<ToDo>> getTodos(){
        return ResponseEntity.ok(todos);
    }
    @PostMapping("/addTodo")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ToDo> addToDo(@RequestBody ToDo newTodo){
        todos.add(newTodo);
        return ResponseEntity.status(HttpStatus.CREATED).body(newTodo);
    }
    @GetMapping("getTodo/{todoId}")
    public ResponseEntity<?> getToDoById(@PathVariable long todoId){
        for(ToDo todo:todos){
            if(todoId == todo.getId()){
                return  ResponseEntity.ok(todo);
            }

        }
        // alomng with 404 not found send a json object liken todo not found.
        ErrorMessageClass errorMessage = new ErrorMessageClass("Todo not found!!");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }
}
