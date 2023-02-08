public class Task {
    protected String description;
    protected boolean isDone;

    public String getDescription() {
        return description;
    }

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public void markAsDone() {

        this.isDone = true;
    }

    public void markAsUnDone()
    {
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "[X]" : "[ ]"); // mark done task with X
    }

    @Override
    public String toString(){
        return "[T]" + this.getStatusIcon() + description;
    }
}


