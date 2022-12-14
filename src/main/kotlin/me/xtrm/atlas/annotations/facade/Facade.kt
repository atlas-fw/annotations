package me.xtrm.atlas.annotations.facade

import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.*

/**
 * Used to annotate a proxied member via its name.
 *
 * @param names The possible names for this member.
 * @param asRegex Whether the values be treated as a regular expression.
 * @param memberType Which member type this facade corresponds to.
 *                   By default, AFW will try to deduct the member
 *                   type from the class context.
 *
 * @author xtrm
 * @since 0.0.1
 */
@Retention(RUNTIME)
@Target(CLASS, FUNCTION, PROPERTY, PROPERTY_GETTER, PROPERTY_SETTER, FIELD, TYPE)
annotation class Facade(
    @get:JvmName("value") vararg val names: String,
    val asRegex: Boolean = false,
    val memberType: MemberType = MemberType.OTHER,
)
