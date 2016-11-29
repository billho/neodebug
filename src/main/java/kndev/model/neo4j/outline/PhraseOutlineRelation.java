package kndev.model.neo4j.outline;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import lombok.Data;

@Data
@RelationshipEntity(type="phraseoutline")
public class PhraseOutlineRelation {
	@GraphId
	private Long graphId;
	@StartNode
	//@Fetch
	private OutlinePhrase phrase;
	
	@EndNode
	//@Fetch
	private OutlineHNode outline;
	
	//@RelationshipType
	@Property
	private String relationName = "phraseoutline";
}
