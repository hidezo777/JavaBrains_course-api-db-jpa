package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
/* CrudRepositoryの仕様をフル活用する。
 * Interface for generic CRUD operations on a repository for a specific type.
 * https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html	
 * 
 * 特殊なものがあればオーバーライドすればよい

	
*/	
}
