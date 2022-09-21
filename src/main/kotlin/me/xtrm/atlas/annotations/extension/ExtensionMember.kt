package me.xtrm.atlas.annotations.extension

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
annotation class ExtensionMember(
    @get:JvmName("value") val member: String,
    vararg val source: KClass<*>,
)
