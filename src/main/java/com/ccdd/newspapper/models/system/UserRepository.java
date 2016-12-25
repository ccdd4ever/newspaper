package com.ccdd.newspapper.models.system;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author yuanhai
 * @ClassName: UserRepository
 * @DESCRIPTION:
 * @date: 2016/12/25.
 */
public interface UserRepository extends MongoRepository<User, String> {
}
