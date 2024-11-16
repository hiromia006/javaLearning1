package fourthClass;

//public class Generic<T>
public class genericWithWildCard<R extends Number> {
    private R content;

    public genericWithWildCard(R content) {
        this.content = content;
    }

    public R getContent() {
        return content;
    }
}
