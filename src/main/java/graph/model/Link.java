package graph.model;

/**
 * Created by pbezglasnyi.
 */
public class Link {

    protected LinkType type;
    protected Point from;
    protected Point to;

    public LinkType getType() {
        return type;
    }

    public void setType(LinkType type) {
        this.type = type;
    }

    public Point getFrom() {
        return from;
    }

    public void setFrom(Point from) {
        this.from = from;
    }

    public Point getTo() {
        return to;
    }

    public void setTo(Point to) {
        this.to = to;
    }
}
