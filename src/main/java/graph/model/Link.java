package graph.model;

/**
 * Created by pbezglasnyi.
 */
public interface Link {

    LinkType type();

    Point from();

    Point to();
}
