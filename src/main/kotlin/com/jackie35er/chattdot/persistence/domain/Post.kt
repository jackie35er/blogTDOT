package com.jackie35er.chattdot.persistence.domain

import com.querydsl.core.annotations.QueryEntity
import org.hibernate.Hibernate
import javax.persistence.*

@Entity(name = "posts")
@QueryEntity
data class Post(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val title: String,

    val description: String,

    @ManyToOne
    val author: User,
){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Post

        return id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

}



