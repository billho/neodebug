package kndev.model.neo4j.outline;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@NodeEntity
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@ToString(of={"text","textStem","tf"})
public class OutlinePhrase {
	@GraphId
    private Long graphId;
	@NonNull
	private String text;
	@NonNull
	//@Indexed(indexType = IndexType.FULLTEXT, indexName = "textStem")
	private String textStem;
	private double tf = 0l;
}
