package kndev.module.neo4j.repo;

import org.springframework.data.neo4j.repository.GraphRepository;

import kndev.model.neo4j.outline.OutlineHNode;

public interface INeo4jRepo extends GraphRepository<OutlineHNode>{
	/*
	@Depth(3)
	public OutlineHNode findByOutlineId(String id);
	@Query("START n=node({id}) RETURN n")
	@Depth(value=3)
	public OutlineHNode findByIds(@Param("id") long id);
	
	*/
	
	//@Query("MATCH (n:OutlineHNode{id:{id}}) OPTIONAL MATCH -[r: suboutline| phraseoutline]-(m) RETURN n, r, m")
	//public OutlineHNode findByIds(@Param("id") long id);
}
