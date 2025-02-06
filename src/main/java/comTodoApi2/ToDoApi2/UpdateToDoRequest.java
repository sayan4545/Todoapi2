package comTodoApi2.ToDoApi2;

public class UpdateToDoRequest {
    private String title;
    private Boolean completed;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}

