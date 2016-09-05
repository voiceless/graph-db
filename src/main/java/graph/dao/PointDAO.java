package graph.dao;

import graph.model.Point;
import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.neo4j.driver.v1.Session;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pbezglasnyi.
 */
public class PointDAO {

    private Driver driver = GraphDatabase.driver("bolt://localhost", AuthTokens.basic("neo4j", "postgres"));
    private Session session = driver.session();

    public void savePoint(Point point) {
        session.run("CREATE (p:Point {name:{name}, xAxis:{xAxis}, yAxis:{yAxis}})", params(point));
    }

    private static Map<String, Object> params(Point point) {
        Map<String, Object> result = new HashMap<>();
        result.put("name", point.getName());
        result.put("xAxis", point.getxAxis());
        result.put("yAxis", point.getyAxis());
        return result;
    }
}
