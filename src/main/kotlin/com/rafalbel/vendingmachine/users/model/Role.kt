package com.rafalbel.vendingmachine.users.model

import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "roles")
data class Role(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    internal val id: Int,
    @Enumerated(EnumType.STRING)
    internal val type: RoleType
)

enum class RoleType {
    ROLE_BUYER,
    ROLE_SELLER
}
