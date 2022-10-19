package me.xtrm.atlas.annotations.facade

import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.*

/**
 * @author xtrm
 * @since 0.0.1
 */
@Retention(RUNTIME)
@Target(FIELD, FUNCTION, PROPERTY, PROPERTY_GETTER, PROPERTY_SETTER, FIELD, TYPE)
annotation class Modifiers(
    @get:JvmName("value") val modifiers: Int,
)
