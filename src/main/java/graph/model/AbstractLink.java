package graph.model;

/**
 * Created by pbezglasnyi.
 */
public abstract class AbstractLink implements Link {

    protected LinkType type;
    protected Point from;
    protected Point to;

    public AbstractLink() {
    }

    public AbstractLink(LinkType type, Point from, Point to) {
        this.type = type;
        this.from = from;
        this.to = to;
    }

    public LinkType type() {
        return type;
    }

    public Point from() {
        return from;
    }

    public Point to() {
        return to;
    }
}
