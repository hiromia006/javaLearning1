package fourthClass;

public class Generic<T> {

    private T content;

    public Generic(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
