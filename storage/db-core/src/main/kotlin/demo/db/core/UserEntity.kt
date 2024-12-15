package demo.db.core


import javax.persistence.Entity

@Entity
class UserEntity (
    val name: String
) : BaseEntity() {
    protected constructor() : this(name = "")
}