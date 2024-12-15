package demo.db.core

import demo.domain.user.User
import demo.domain.user.UserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository

@Repository
class UserEntityRepository (
    private val userJpaRepository: UserJpaRepository
): UserRepository {
    override fun add(name: String): Long {
        return userJpaRepository.save(
            UserEntity(name = name)
        ).id!!
    }

    override fun read(id: Long): User? {
        return userJpaRepository.findByIdOrNull(id)?.let {
            User(
                id = it.id!!,
                name = it.name
            )
        }
    }
}