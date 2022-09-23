package me.xtrm.atlas.annotations.extension

import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.*
import kotlin.reflect.KClass

/**
 * Represents a foreign member that's to be replaced by the annotation target.
 *
 * TODO: better documentation
 *
 * @see Extends
 *
 * @author xtrm
 * @since 0.0.1
 */
@Target(FIELD, FUNCTION, PROPERTY, PROPERTY_GETTER, PROPERTY_SETTER, FIELD, TYPE, CLASS)
@Retention(RUNTIME)
annotation class ExtensionMember(
    @get:JvmName("value") val member: String,
    vararg val source: KClass<*>,
)
