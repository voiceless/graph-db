CREATE (p:Point {name:'First', xAsis:15.15, yAxis:15.15});

CREATE (p:Point {name:'Second', xAsis:20.20, yAxis:20.20});

MATCH (f:Point {name:'First'}) MATCH (s:Point{name:'Second'}) CREATE (f)-[d:DIRECT]->(s)


