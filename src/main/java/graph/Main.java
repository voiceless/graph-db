package graph;

import org.neo4j.driver.v1.*;

/**
 * Created by pbezglasnyi.
 */
public class Main {

    public static void main(String[] args) {
        Driver driver = GraphDatabase.driver( "bolt://localhost", AuthTokens.basic( "neo4j", "postgres" ) );
        Session session = driver.session();

        session.run( "CREATE (a:Person {name:'Arthur', title:'King'})" );

        StatementResult result = session.run( "MATCH (a:Person) WHERE a.name = 'Arthur' RETURN a.name AS name, a.title AS title" );
        while ( result.hasNext() )
        {
            Record record = result.next();
            System.out.println( record.get( "title" ).asString() + " " + record.get("name").asString() );
        }

        session.close();
        driver.close();

    }
}
