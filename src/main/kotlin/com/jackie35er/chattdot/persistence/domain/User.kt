package com.jackie35er.chattdot.persistence.domain

import com.querydsl.core.annotations.QueryEntity
import org.hibernate.Hibernate
import javax.persistence.*

@Entity(name = "Users")
@QueryEntity
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(unique = true)
    val username: String,

    val password: String,
    val role: String,
    val email: String,
    val profilePictureBase64: String,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as User

        return id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id )"
    }

}
