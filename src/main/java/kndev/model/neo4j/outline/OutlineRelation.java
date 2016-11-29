package kndev.model.neo4j.outline;



import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import lombok.Data;
@Data
@RelationshipEntity(type="suboutline")
public class OutlineRelation {
	@GraphId
	private Long graphId;
	@StartNode
	//@Fetch
	private OutlineHNode parent;
	
	@EndNode
	//@Fetch
	private OutlineHNode child;
	
	//@RelationshipType
	private String relationName="suboutline";
}
