package kndev.model.neo4j.outline;

import java.util.HashSet;
import java.util.Set;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
@Data
@NodeEntity
@RequiredArgsConstructor
@NoArgsConstructor
@ToString(of={"text","graphId"})
public class OutlineHNode{
	@GraphId
    private Long graphId;
	@NonNull
	String text;
	
	@NonNull
	Integer year;
	
	@NonNull
	String articleId;
	@NonNull
	String outlineId;
	
	@Relationship(type="suboutline")
	private Set<OutlineHNode> childNodes=new HashSet<OutlineHNode>();

	@Relationship(type="phraseoutline",direction=Relationship.INCOMING)
	private Set<OutlinePhrase> phrases= new HashSet<OutlinePhrase>();
	
	
}
