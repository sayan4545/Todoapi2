package comTodoApi2.ToDoApi2;

import org.springframework.stereotype.Component;

@Component
public class ToDo {
    private int id;
    private boolean isCompleted;
    private String title;
    private int userId;

    public ToDo(int id, boolean isCompleted, String title, int userId) {
        this.id = id;
        this.isCompleted = isCompleted;
        this.title = title;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", isCompleted=" + isCompleted +
                ", title='" + title + '\'' +
                ", userId=" + userId +
                '}';
    }
}
