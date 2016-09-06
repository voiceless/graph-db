package graph;

import org.neo4j.driver.v1.*;

/**
 * Created by pbezglasnyi.
 */
public class Main {

    public static void main(String[] args) {
        Driver driver = GraphDatabase.driver("bolt://localhost", AuthTokens.basic("neo4j", "postgres"));
        Session session = driver.session();

//        session.run( "CREATE (a:Person {name:'Arthur', title:'King'})" );

        for (int i = 0; i < 30; i++) {
            StatementResult result = session.run(String.format("CREATE (p:Point {name:'Point%s'})", i));
        }

       /* StatementResult result = session.run("MATCH (p:Point) RETURN ID(p) as name");
        while (result.hasNext()) {
            Record record = result.next();
//            System.out.println(record.values().stream().map(v->v.containsKey("name")).collect(Collectors.toList()));
            System.out.println(record.get("name").asInt());
        }*/

        session.close();
        driver.close();

    }
}
